package com.lmt.ioc;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 张洲徽 on 2018/11/6.
 */
public class JdbcDataSource  implements Serializable {
    private String driver;
    private String url;
    private String user;
    private String pwd;

    public JdbcDataSource(String driver, String url, String user, String pwd) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
        try{
            Class.forName(driver);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("驱动！",e);
        }
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public Connection getConnection() throws SQLException {
        Connection con= DriverManager.getConnection(url, user, pwd);
        return con;
    }
    public void close(Connection conn) {
        try {
            if(conn!=null){
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
