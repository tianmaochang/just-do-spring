package com.now.staticproxy;

/**
 * 代理模式：
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 自己的语言理解：比如A对象要做一件事情，在没有代理前，自己来做；
 * 在对 A 代理后，由 A 的代理类 B 来做。代理其实是在原实例前后加了一层处理，这也是 AOP 的初级轮廓。

 * 静态代理模式：静态代理说白了，就是在程序运行前就已经存在代理类的字节码文件、代理类和原始类的关系在运行前就已经确定
 * Created by TMAC on 2019/4/1.
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        IUserDao proxy = new UserDaoProxy();
        proxy.save();
    }
}
