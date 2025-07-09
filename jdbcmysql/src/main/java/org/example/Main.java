package org.example;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // MySQL connection details
                String url = "jdbc:mysql://localhost:3306/employeetest";
                String user = "root";
                String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            // First Employee
            stmt.setInt(1, 101);
            stmt.setString(2, "Jenny");
            stmt.setInt(3, 25);
            stmt.setDouble(4, 10000);
            stmt.executeUpdate();

            // Second Employee
            stmt.setInt(1, 102);
            stmt.setString(2, "Jacky");
            stmt.setInt(3, 30);
            stmt.setDouble(4, 20000);
            stmt.executeUpdate();

            // Third Employee
            stmt.setInt(1, 103);
            stmt.setString(2, "Joe");
            stmt.setInt(3, 20);
            stmt.setDouble(4, 40000);
            stmt.executeUpdate();

            // Fourth Employee
            stmt.setInt(1, 104);
            stmt.setString(2, "John");
            stmt.setInt(3, 40);
            stmt.setDouble(4, 80000);
            stmt.executeUpdate();

            // Fifth Employee
            stmt.setInt(1, 105);
            stmt.setString(2, "Shameer");
            stmt.setInt(3, 25);
            stmt.setDouble(4, 90000);
            stmt.executeUpdate();

            System.out.println("All records inserted successfully!");
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        }


