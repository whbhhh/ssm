package com.whb.mapper;

import com.whb.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where uid =#{uid}")
    User query(Integer uid);
}
