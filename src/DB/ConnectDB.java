/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vanqu
 */
public class ConnectDB {
    private static ConnectDB instance = new ConnectDB();
    private ConnectDB(){
        
    }
    //thiết lập thông tin kết nối
    String hostName = "localhost";
    String dbName = "karaoke";
    String userName = "root";
    String passWord = "";
    String url = "jdbc:mysql://" + hostName + ":3306/" + dbName;
    Connection conn = null;
    
    public static ConnectDB getInstance(){
        return instance;
    }
    
    public Connection getConnection(){
        if(conn == null){
            conn = open();
        }
        return conn;
    }
    
    
    private Connection open(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    private void close(){
        try {
            if(conn != null){
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
