package com.shibofu.spring.db1.service;

import com.shibofu.spring.db1.dao.UserDao;
import com.shibofu.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author potter.fu
 * @date 2018-12-07 15:33
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据名字查找用户
     */
    public User selectUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
