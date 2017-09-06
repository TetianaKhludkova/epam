package com.main.java.restaurant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {

    public static void prepareDb() {

        try (Connection connection = Database.getConnection()) {
            Statement statement = connection.createStatement();
            try {
                BufferedReader in = new BufferedReader(new FileReader("/sql/createDatabase.sql"));
                String str;
                StringBuffer sb = new StringBuffer();
                while ((str = in.readLine()) != null) {
                    sb.append(str + "\n ");
                }
                in.close();
                statement.executeUpdate(sb.toString());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
