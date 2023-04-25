package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) throws Exception {

        String url="jdbc:mysql://localhost:3306/mycompany";
        String username ="root";
        String password ="Mk4415547/";

        //1.Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.Connect the Database
        Connection con= DriverManager.getConnection(url, username, password);

        //3.Query the Database
        Statement stmt=con.createStatement();
        ResultSet rs1 = stmt.executeQuery("select first_name from employees;");

        //4. Print Result
        while(rs1.next()) {
            System.out.println(rs1.getString("first_name"));
        }

        //5.Close the Database
        con.close();
    }
}
