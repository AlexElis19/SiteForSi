package com.siteforsi.dao;

import com.siteforsi.entity.Product;
import com.siteforsi.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProductDataImpl implements ProductData {
    public final JdbcTemplate jdbcTemplate;
    @Autowired
    public ProductDataImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
        String sql = "SELECT * FROM product";

        return jdbcTemplate.query(sql, new ProductMapper());
    }
}
