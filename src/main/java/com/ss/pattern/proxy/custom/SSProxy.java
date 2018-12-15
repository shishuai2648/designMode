package com.ss.pattern.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SSProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(SSClassLoader classLoader,Class<?>[] interfaces,SSInvocationHandler h) throws Exception {
        // 1、动态生成源代码.java文件
        String src = generateSrc(interfaces);
        // 2、将.java文件输出到磁盘
        String path = SSProxy.class.getResource("").getPath();
        File f = new File(path + "$Proxy0.java");
        System.out.println(path);
        FileWriter fw = null;

        try {
            fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 3、将生成的.java文件编译成.class文件

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        manager.close();

        // 4、将编译生成的.class文件加载到JVM中来
        Class<?> proxyClass = classLoader.findClass("$Proxy0");
        Constructor<?> constructor = proxyClass.getConstructor(SSInvocationHandler.class);

        // 5、返回字节码重组以后的代理对象
//        f.delete();

        return constructor.newInstance(h);

    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb
                .append("package com.ss.pattern.proxy.custom;" + ln)
                .append("import com.ss.pattern.proxy.staticed.Person;" + ln)
                .append("import java.lang.reflect.Method;" + ln)
                .append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln)
                .append("    SSInvocationHandler h;" + ln)
                .append("    public $Proxy0(SSInvocationHandler h) {" + ln)
                .append("        this.h = h;"+ln)
                .append("    }" + ln);
        for(Method m : interfaces[0].getMethods()){
            sb
                    .append("public "+m.getReturnType().getName()+" "+m.getName() + "(){" + ln)
                    .append("   try{" + ln)
                    .append("       Method m = " + interfaces[0].getName() + ".class.getMethod(\""+m.getName()+"\",new Class[]{});"+ln)
                    .append("       this.h.invoke(this,m,null);"+ln)
                    .append("   } catch (Throwable e) {"+ln)
                    .append("       e.printStackTrace();" + ln)
                    .append("   }" + ln)
                    .append("}");
        }
        sb.append("}");

        return sb.toString();
    }
}
