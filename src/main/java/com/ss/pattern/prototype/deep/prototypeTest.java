package com.ss.pattern.prototype.deep;

public class prototypeTest {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        qiTianDaSheng.setJinGuBang(new JinGuBang());

        QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();

        System.out.println(qiTianDaSheng.getJinGuBang());
        System.out.println(clone.getJinGuBang());

    }
}
