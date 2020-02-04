package com.jdbc.error;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;

import java.sql.SQLException;

public class MyErrorCode extends SQLErrorCodeSQLExceptionTranslator {
    @Override
    protected DataAccessException customTranslate(String task, String sql, SQLException sqlEx) {
        if (sqlEx.getErrorCode() == 12345){
            return new DeadlockLoserDataAccessException(task,sqlEx);
        }
        return null;
    }

//    public static void main(String[] args) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(null);
//        MyErrorCode errorCode = new MyErrorCode();
//        errorCode.setDataSource(null);
//        jdbcTemplate.setExceptionTranslator(errorCode);
//    }
}
