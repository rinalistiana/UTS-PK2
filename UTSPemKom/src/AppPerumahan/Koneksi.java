/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPerumahan;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Notebook
 */
public class Koneksi {
    private static Connection MYSQLConfig;
    public static Connection sambungDB(){
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("perumahan");
            dataSource.setPortNumber(3306);
            dataSource.setAllowMultiQueries(true); 
            Connection c = dataSource.getConnection();
            return c;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
