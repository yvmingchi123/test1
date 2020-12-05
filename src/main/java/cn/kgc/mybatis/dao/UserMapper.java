package cn.kgc.mybatis.dao;

import cn.kgc.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUser();
}
