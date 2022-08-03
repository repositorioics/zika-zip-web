package ni.org.ics.zip.utils;

import com.mysql.cj.jdbc.MysqlDataSource;


import java.sql.Connection;


public class ConnectionUtil {

    public static Connection getConnection() throws Exception {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("zikazip");
        dataSource.setPassword("jeKAQudi");
        //dataSource.setPassword("123456");
        //dataSource.setServerName("141.211.217.99");
        dataSource.setServerName("localhost");
        dataSource.setPort(3306);
        dataSource.setDatabaseName("zika_zip");
        dataSource.setUseSSL(false);
        dataSource.setCharacterEncoding("UTF-8");
        dataSource.setServerTimezone("UTC");

        return dataSource.getConnection();
    }
}
