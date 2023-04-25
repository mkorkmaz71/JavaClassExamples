package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HW_01 {
    public static void main(String[] args) throws Exception {
        //Using JDBC, Execute the following queries and print data into the console of IntelliJ
        //Fetch all employees sorted by youngest to oldest
        //Fetch all unique countries from employees table
        //Fetch all records of QA Engineers
        String url="jdbc:mysql://localhost:3306/mycompany";
        String username ="root";
        String password ="Mk4415547/";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url, username, password);
        Statement stmt=con.createStatement();

        ResultSet rs1 = stmt.executeQuery("select  first_name, description from employees e inner join roles r on "+
               " e.designation_id=r.role_id where description like \"%QA%\"");
        while(rs1.next()) {
            System.out.println(rs1.getString("first_name")+" - "+rs1.getString("description"));
        }
        con.close();
    }
}
