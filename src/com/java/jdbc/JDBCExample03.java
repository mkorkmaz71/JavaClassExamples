package com.java.jdbc;

import java.sql.*;

public class JDBCExample03 {
    public static void main(String[] args) throws Exception {

        String url="jdbc:mysql://localhost:3306/mycompany";
        String username ="root";
        String password ="Mk4415547/";

            //1. Connect
            Class.forName("com.mysql.cj.jdbc.Driver"); // To register driver
            Connection con = DriverManager.getConnection(url, username, password); // Create connection with database

            // 2. Query
            // Statement interface has method to execute query, so we create object of statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees;");

            //3. Print Result
            // rs will point to before first row in the database
            // When we use rs.next(), it will move cursor to next row and return true -
            // if we have data on next row, otherwise it will return false
            ResultSetMetaData rsmd = rs.getMetaData();
            // retrieve the column labels
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnLabel(i) + "  ");
        }

            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

            //4. Close
            con.close();

    }
}
