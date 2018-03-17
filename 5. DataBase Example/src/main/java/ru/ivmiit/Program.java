package ru.ivmiit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 14.03.2018
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {
    public static void main(String[] args) throws Exception {
        String dbUser = "postgres";
        String dbPassword = "qwerty007";
        String connectionUrl = "jdbc:postgresql://localhost:5432/fix_users";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM fix_user");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
}
