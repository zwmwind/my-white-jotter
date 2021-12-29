package com.zwm.mywhitejotter.service.impl;

import com.zwm.mywhitejotter.mapper.UserMapper;
import com.zwm.mywhitejotter.pojo.User;
import com.zwm.mywhitejotter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: zhangweiming
 * @Date: 21:54 2021/12/29
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
