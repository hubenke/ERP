package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT uid,uname,`password`,salt,`limit` FROM user")

    User queryByUserNameAndPwd(@Param("uname")String uname,@Param("password")String password);




}
