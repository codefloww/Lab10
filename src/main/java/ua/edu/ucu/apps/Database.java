package ua.edu.ucu.apps;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Database {
    private static Database dbConnection;
    private final java.sql.Connection jdbcConnection;
    private Database() throws SQLException {
        jdbcConnection = DriverManager.getConnection("jdbc:sqlite:users.sqlite");
    }
    public static Database getInstance() throws SQLException {
        if (dbConnection == null) {
            dbConnection = new Database();
        }
        return dbConnection;
    }
    public void executeQuery(String query) throws SQLException{
        Statement stmt = jdbcConnection.createStatement();
        stmt.executeQuery(query);
        stmt.close();
    }
    public String getUserData() {
        return "hello";
    }

    public String getStaticData() {
        return "hello2";
    }
}
