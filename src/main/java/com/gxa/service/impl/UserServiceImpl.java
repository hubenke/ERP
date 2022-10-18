package com.gxa.service.impl;

import com.gxa.common.uitls.GyUitls;
import com.gxa.common.uitls.R;
import com.gxa.entity.MyOrder;
import com.gxa.entity.User;
import com.gxa.mapper.UserMapper;
import com.gxa.service.MyOrderService;
import com.gxa.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;



    @Override
    public void add(User user) {

    }

    @Override
    public void updateById(Integer uid) {

    }



        @Override
    public void queryByUid(Integer uid) {

    }

    @Override
    public User login(User user) {
        /*GyUitls gyUitls = new GyUitls();*/
        String uname = user.getUname();
        String password = user.getPassword();
        SimpleHash mm = GyUitls.salt(password);
        User u= userMapper.queryByUserNameAndPwd(uname, mm);
        return u;

    }
}
