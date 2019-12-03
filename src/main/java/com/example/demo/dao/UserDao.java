package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author by HZL
 * @date 2019/12/3 15:23
 * @description
 */

@Mapper
@Repository
public interface UserDao {
    User getUserById(int id);
}
