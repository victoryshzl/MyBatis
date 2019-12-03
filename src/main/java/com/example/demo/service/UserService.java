package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by HZL
 * @date 2019/12/3 15:27
 * @description
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getUserById(int id){
        return userDao.getUserById(id);
    }

}
