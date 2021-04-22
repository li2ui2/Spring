package cn.china.service.impl;


import cn.china.service.IAccountService;

/**
 * @author LiWei
 * @date 2021/03/17 19:51
 * @description 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    public AccountServiceImpl(){
        System.out.println("对象被创建了");
    }

    public void saveAccount(){
        System.out.println("service中的saveAccount方法执行了。。");
    }

    public void  init(){
        System.out.println("对象初始化了。。");
    }

    public void destroy(){
        System.out.println("对象销毁了。。");
    }
}