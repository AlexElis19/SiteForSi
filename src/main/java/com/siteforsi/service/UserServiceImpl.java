package com.siteforsi.service;

import com.siteforsi.dao.UserData;
import com.siteforsi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserData userData;
    public List<User> findAll() {
        return userData.findAll();
    }
}
