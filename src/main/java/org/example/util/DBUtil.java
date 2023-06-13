package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/12 23:38
 * @since JDK17
 */

public class DBUtil {
    private String dbUrl="jdbc:mysql://localhost:3306/10cateringSys" +
            "?useUnicode=true&characterEncoding=utf8";
    private String dbUserName="root";
    private String dbPassword="Shangxiao111";
    private String jdbcName="com.mysql.cj.jdbc.Driver";

    /**
     * 获取数据库连接
     * @return
     * @throws Exception
     */
    public Connection getCon() throws Exception{
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    /**
     * 关闭数据库连接
     * @param con
     * @throws Exception
     */
    public void closeCon(Connection con) throws Exception{
        if(con!=null){
            con.close();
        }
    }

//    public static void main(String[] args) {
//        DBUtil dbUtil = new DBUtil();
//        try {
//            dbUtil.getCon();
//            Logger.getGlobal().info("数据库连接成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//            Logger.getGlobal().info("数据库连接失败");
//        }
//    }
}
