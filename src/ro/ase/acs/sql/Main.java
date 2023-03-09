package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            DbInitiliazer dbInitiliazer = new InitializeEmployeeDb();
            Connection connection = dbInitiliazer.dbInitialize();

            CreateTable createTable = new CreateEmployeeTb();
            createTable.createTable(connection);

            Insert insertEmployee = new InsertEmployee();
            insertEmployee.insertData(connection);

            Read readEmployee = new ReadEmployee();
            readEmployee.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}