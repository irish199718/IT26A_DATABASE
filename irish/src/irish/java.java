package irish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java {
    private static final String URL = "jdbc:mysql://localhost:3306/midterm_db";
    private static final String USER = "root";
    private static final String PASS = ""; 

    public static Connection getjava() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
