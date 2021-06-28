package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

public interface UserService {
    //获取用户信息
    User getUser(Integer id);
    void addScore(Integer id,Integer score);
}
