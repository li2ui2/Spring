package cn.china.service.impl;

import cn.china.dao.IAccountDao;
import cn.china.dao.impl.AccountDaoImpl;
import cn.china.service.IAccountService;

/**
 * @author LiWei
 * @date 2021/03/17 19:51
 * @description 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao = new AccountDaoImpl();

    private AccountServiceImpl(){
        System.out.println("对象被创建了");
    }

    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
