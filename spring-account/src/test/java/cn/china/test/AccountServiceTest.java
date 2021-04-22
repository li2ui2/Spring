package cn.china.test;

import cn.china.domain.Account;
import cn.china.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author LiWei
 * @date 2021/03/22 10:24
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {
    @Autowired
    @Qualifier("proxyaccountService")
    private IAccountService as;
    @Test
    public  void testTransfer(){
        as.transfer("aaa","bbb",100f);
    }

}
