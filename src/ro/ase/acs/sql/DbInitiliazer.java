package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbInitiliazer {
    Connection dbInitialize() throws ClassNotFoundException, SQLException;
}
