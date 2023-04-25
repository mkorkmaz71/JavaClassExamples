package com.java.jdbc;

import java.sql.*;

public class JDBCExample02 {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/mycompany";
        String username ="root";
        String password ="Mk4415547/";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url, username, password);
        Statement stmt=con.createStatement();
        ResultSet rs1 = stmt.executeQuery("select * from employees;");
        ResultSetMetaData rsmd = rs1.getMetaData();
        while (rs1.next()) {
            for (int i=1; i<=rsmd.getColumnCount();i++){
                System.out.print(rs1.getString(i)+"\t");
        }System.out.println();
        }

        con.close();
    }
}
