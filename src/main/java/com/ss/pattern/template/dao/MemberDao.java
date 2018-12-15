package com.ss.pattern.template.dao;

import com.ss.pattern.template.JdbcTemplate;
import com.ss.pattern.template.RowMapper;
import com.ss.pattern.template.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query(){
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();

                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.getAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }

//    @Override
//    public Object processResult(ResultSet rs,int rowNum) throws SQLException {
//        Member member = new Member();
//
//        member.setUsername(rs.getString("username"));
//        member.setPassword(rs.getString("password"));
//        member.setAge(rs.getInt("age"));
//        member.getAddr(rs.getString("addr"));
//        return member;
//    }
}
