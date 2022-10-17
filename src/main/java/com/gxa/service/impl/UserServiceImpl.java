package com.gxa.service.impl;

import com.gxa.entity.MyOrder;
import com.gxa.entity.User;
import com.gxa.mapper.UserMapper;
import com.gxa.service.MyOrderService;
import com.gxa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uname, String password) {
        User user =this.userMapper.queryByUserNameAndPwd(uname,password);

        return user;
//        return null;
    }

    @Override
    public void add() {

    }

    @Override
    public void queryByUid(Integer uid) {

    }
}
