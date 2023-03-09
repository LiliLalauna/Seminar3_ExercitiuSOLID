package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.SQLException;

public interface Read {
    public void readData(Connection connection) throws SQLException;
}
