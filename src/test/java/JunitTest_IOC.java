import com.lmt.dao.CostDao;
import com.lmt.entity.Cost;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/5.
 */
public class JunitTest_IOC extends BaseJunit4Test{
    @Resource  //自动注入,默认按名称
    private CostDao costdao;
    @org.junit.Test  //标明是测试方法
    @Ignore  //表示该方法被忽略
    //@Transactional   //标明此方法需使用事务
    //@Rollback(true)  //标明使用完此方法后事务不回滚,true时为回滚
    public void find( ) {
        List<Cost> list=costdao.findAll();
        for (Cost cost:list) {
            System.out.println(cost.getName());
        }
    }

    @org.junit.Test
    public void test_IOC_start(){
        String conf="classpath:applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        CostDao costDao=ac.getBean("costDao",CostDao.class);
        List<Cost> list=costdao.findAll();
        for (Cost cost:list) {
            System.out.println(cost.getName());
        }
    }
}
