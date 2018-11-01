import com.lmt.dao.CostDao;
import com.lmt.entity.Cost;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/1.
 */
public class Test2 {
    public static void main(String[] args){
        String conf="classpath:applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        CostDao costDao=ac.getBean("costDao",CostDao.class);
        List<Cost> list=costDao.findAll();
        for(Cost c:list){
            System.out.println(c.getCost_id()+"  "+c.getName());
        }
    }
}
