package cn.china.ui;

import cn.china.factory.BeanFactory;
import cn.china.service.IAccountService;
import cn.china.service.impl.AccountServiceImpl;

/**
 * @author LiWei
 * @date 2021/03/17 19:52
 * @description 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
//        IAccountService as = new AccountServiceImpl();
        for(int i=0;i<5;i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }

    }
}
