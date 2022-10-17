package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.UserDto;
import com.gxa.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

//    @Select("SELECT uid,uname,`password`,salt,`limit` FROM user")
//
    User queryByUserNameAndPwd(@Param("uname")String uname, @Param("password")String password);

    void add(User user);//添加操作

    void queryByUid(Integer uid);//根据id查找

    void updateById(Integer uid);//根据id修改


     List<User> queryAll(UserDto userDto);

//     List<User> queryById();//根据



}
