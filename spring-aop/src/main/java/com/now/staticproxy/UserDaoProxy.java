package com.now.staticproxy;

/**
 * 静态代理类
 * 特点：代理对象要实现和目标对象一样的接口
 * Created by TMAC on 2019/4/1.
 */
public class UserDaoProxy implements IUserDao {
    // 代理对象，需要维护一个目标对象
    private IUserDao terget = new UserDao();

    public void save() {
        System.out.println("代理操作：开启事务");
        terget.save();  //执行目标对象的方法
        System.out.println("代理操作：提交事务");
    }

    public void find() {
        terget.find();
    }
}
