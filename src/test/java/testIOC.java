import com.lmt.ioc.A;
import com.lmt.ioc.JdbcDataSource;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 张洲徽 on 2018/11/6.
 */
public class testIOC extends BaseJunit4Test{
    @org.junit.Test
    @Ignore
    public void testA(){
        String conf="classpath:ioc_buchong.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        A a1=ac.getBean("a1",A.class);
        a1.execute();
    }

    @org.junit.Test
    public void testB() throws SQLException {
        String conf="classpath:ioc_buchong.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        JdbcDataSource ds = ac.getBean("dataSource", JdbcDataSource.class);
        Connection con=ds.getConnection();
        System.out.println(con.getMetaData().getDatabaseProductName());
        con.close();
    }

}
