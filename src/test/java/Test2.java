import com.lmt.dao.CostDao;
import com.lmt.dao.MyCostDao;
import com.lmt.entity.Cost;

import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/1.
 */
public class Test2 {
    public static void main(String[] args){
        /*
        String conf="classpath:applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        CostDao costDao=ac.getBean("costDao",CostDao.class);
        List<Cost> list=costDao.findAll();
        for(Cost c:list){
            System.out.println(c.getCost_id()+"  "+c.getName());
        }
        */

        CostDao dao=new MyCostDao();
        List<Cost> list2=dao.findAll();
        for(Cost c:list2){
            System.out.println(c.getCost_id()+"  "+c.getName());
        }
    }
}
