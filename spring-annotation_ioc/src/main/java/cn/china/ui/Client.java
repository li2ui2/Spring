package cn.china.ui;

import cn.china.dao.IAccountDao;
import cn.china.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author LiWei
 * @date 2021/03/17 19:52
 * @description 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.根据id获取Bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
//        IAccountService as2 = (IAccountService) ac.getBean("accountService");
//        System.out.println(as==as2);
//        System.out.println(as);
//
//        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);
//        System.out.println(adao);
        as.saveAccount();
        ac.close();

    }
}
