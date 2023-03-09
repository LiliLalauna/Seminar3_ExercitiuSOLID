package ro.ase.acs.sql;

import java.sql.Connection;

public interface Insert {
    void insertData(Connection connection) throws Exception;
}
