package ro.ase.acs.sql;

import java.sql.Connection;

public interface CreateTable {
    void createTable(Connection connection) throws Exception;
}
