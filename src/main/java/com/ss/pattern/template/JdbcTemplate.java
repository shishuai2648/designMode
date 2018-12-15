package com.ss.pattern.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection conn,String sql) throws Exception{
        return conn.prepareStatement(sql);
    }

    private ResultSet executeQuery(PreparedStatement pstmt,Object[] values) throws Exception{
        for(int i = 0 ; i < values.length ; i ++){
            pstmt.setObject(i,values);
        }
        return pstmt.executeQuery();
    }

    private void closeStatement(Statement stmt) throws Exception{
        stmt.close();
    }
    private void closeResult(ResultSet rs) throws Exception{
        rs.close();
    }
    private void closeConnection(Connection conn) throws Exception{
        // 先不关，会回收
    }

    private List<?> parseResultSet(ResultSet rs,RowMapper<?> rowMapper) throws Exception{
        ArrayList<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper,Object[] values) {

        // 1、获取连接
        Connection conn = null;
        try {
            conn = this.getConnection();

            // 2、创建语句集
            PreparedStatement pstm = this.createPreparedStatement(conn,sql);
            // 3、执行语句集，并且获得结果集
            ResultSet rs = this.executeQuery(pstm,values);
            // 4、解析结果集
            List<?> result = this.parseResultSet(rs, rowMapper);
            // 5、关闭结果集
            this.closeResult(rs);
            // 6、关闭语句集
            this.closeStatement(pstm);
            // 7、关闭连接
            conn.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
