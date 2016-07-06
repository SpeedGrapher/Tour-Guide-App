package database_layer_package;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Created by Ale on 6/30/2016.
 */
public class DatabaseRead {
    private String query;
    private Statement statement;
    private ResultSet resultSet;
    public DatabaseRead() throws SQLException {
        statement = databaseConnection.getConnection().createStatement();
    }
    public String getLastName() throws SQLException {
        String lastname = "";
        query = "select last_name from user where user_name = " + "'" + username + "'"; //need to get username as soon as we log in.
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            lastname += resultSet.getString("last_name");
        }
        System.out.println(lastname);
        return lastname;
    }

}
