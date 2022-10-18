package com.gxa.service;

import com.gxa.common.uitls.GyUitls;
import com.gxa.common.uitls.R;
import com.gxa.entity.MyOrder;
import com.gxa.entity.User;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.List;

public interface UserService {

//    User login(String uname,String password);

    void  add(User user);

    void updateById(Integer uid);

    void queryByUid(Integer uid);

    User login(User user);

    void updateNameAndPwd(User user);



}
