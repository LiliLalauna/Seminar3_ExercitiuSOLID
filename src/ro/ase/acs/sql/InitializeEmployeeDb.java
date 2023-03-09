package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InitializeEmployeeDb implements DbInitiliazer {
    @Override
    public Connection dbInitialize() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        connection.setAutoCommit(false);
        return connection;
    }
}
