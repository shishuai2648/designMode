package com.ss.pattern.template;

import java.sql.ResultSet;

public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
