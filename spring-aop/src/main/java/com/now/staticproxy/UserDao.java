package com.now.staticproxy;

/**
 * 目标对象
 * Created by TMAC on 2019/4/1.
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("模拟保存用户");
    }

    public void find() {
        System.out.println("模拟查询用户");
    }
}
