package com.siteforsi.service;

import com.siteforsi.dao.ProductData;

import com.siteforsi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    public ProductData productData;
    public List<Product> findAll() {
        return productData.findAll();
    }
}
