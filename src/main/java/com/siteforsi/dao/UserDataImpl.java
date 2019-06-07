package com.siteforsi.dao;
import com.siteforsi.entity.User;
import com.siteforsi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDataImpl implements UserData {
    public final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserDataImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM user";

        return jdbcTemplate.query(sql, new UserMapper());
    }
}
