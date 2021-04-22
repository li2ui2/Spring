package cn.china.dao.impl;

import cn.china.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author LiWei
 * @date 2021/03/17 19:48
 * @description 账户的持久层实现类
 */
@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {


    public  void saveAccount(){

        System.out.println("保存了账户1111111111111");
    }

}
