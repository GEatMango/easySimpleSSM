package com.simple.dao;

import com.simple.pojo.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    UserInfo selectUser(String id);
}
