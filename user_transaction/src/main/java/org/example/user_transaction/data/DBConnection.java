package org.example.user_transaction.data;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/user_management";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Trang1234";
    private static Connection connection;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void close(){
        try {
            if (connection != null){
                connection.close();
            }
        } catch (SQLException throwablese) {
            throwablese.printStackTrace();
        }

    }

}
