package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String PASSWORD = "postgres";
    private static final String USERNAME = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/mario";

    static {
        loadDriver();
    }
private static  void loadDriver(){
    try {
        Class.forName ( "org.postgresql.Driver" );
    } catch (ClassNotFoundException e) {
        throw new RuntimeException ( e );
    }
}

private Util(){

}
    public static Connection open() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
