package com.siteforsi.config;
import com.siteforsi.dao.ProductData;
import com.siteforsi.dao.ProductDataImpl;
import com.siteforsi.dao.UserData;
import com.siteforsi.dao.UserDataImpl;
import com.siteforsi.service.ProductService;
import com.siteforsi.service.ProductServiceImpl;
import com.siteforsi.service.UserService;
import com.siteforsi.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
    @Bean
    public DataSource getDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUrl("jdbc:mysql://localhost:3306/siteforsi?useUnicode=true&serverTimezone=UTC&useSll=false");
    dataSource.setUsername("root");
    dataSource.setPassword("admin");
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    return dataSource;
    }

    @Bean
    public UserData getUserData(){
        return new UserDataImpl(getJdbcTemplate());
    }
    @Bean
    public ProductData getProductData(){
        return new ProductDataImpl(getJdbcTemplate());
    }
    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
    @Bean
    public ProductService getProductService(){
        return new ProductServiceImpl();
    }
}
