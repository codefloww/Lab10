package ua.edu.ucu.apps;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLException;

@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private int age;
    private Database db;
    public User(String userName, String userEmail, int userAge, Database db) throws SQLException {
        name = userName;
        email = userEmail;
        age = userAge;
        db = Database.getInstance();
    }
    public void save() throws SQLException {
        db.executeQuery("INSERT INTO user VALUES ('" + name + "', '" + email + "', " + age + ")");
    }
}
