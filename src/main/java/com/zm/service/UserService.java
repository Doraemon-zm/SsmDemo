package com.zm.service;

import com.zm.mapper.UserMapper;
import com.zm.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/16.
 */
@Service
@Transactional
public class UserService {
    @Resource
    private UserMapper userMapper;
    public User getUserById(String id){
        User user = userMapper.selectByPrimaryKey(new Integer(id));
        return user;
    }
}
