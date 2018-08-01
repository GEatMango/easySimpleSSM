package com.simple.service.impl;

import com.simple.dao.UserDao;
import com.simple.pojo.UserInfo;
import com.simple.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public UserInfo selectUser(String userId) {
        return userDao.selectUser(userId);
    }
}
