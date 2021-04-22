package cn.china.ui;

import cn.china.service.IAccountService;
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
        as.saveAccount();

        // 手动关闭容器
        ac.close();
    }
}
