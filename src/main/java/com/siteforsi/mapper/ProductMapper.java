package com.siteforsi.mapper;

import com.siteforsi.entity.Product;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setCost(resultSet.getInt("cost"));
        return product;
    }
}
