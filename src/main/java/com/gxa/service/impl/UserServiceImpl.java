package com.gxa.service.impl;

import com.gxa.common.uitls.GyUitls;
import com.gxa.entity.User;
import com.gxa.mapper.UserMapper;
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
    public Integer add(User user) {
        int add = userMapper.add(user);
        return add;


    }

    @Override
    public Integer updateById(Integer uid) {
        int updateById = userMapper.updateById(uid);
        return updateById;


    }



    @Override
    public List<User> queryByUid(Integer uid) {
        List<User> users =this.userMapper.queryByUid(uid);
        return users;



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

    @Override
    public void updateNameAndPwd(User user) {
       this.userMapper.updateNameAndPwd(user);
//       return updateNameAndPwd;

    }

    @Override
    public List<User> queryAll() {
        List<User> users =this.userMapper.queryAll();
        return users;
    }
}
