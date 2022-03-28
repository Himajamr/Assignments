package com.pramati.Books;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "himaja2904");
            while (true){
                String op = sc.next();
                switch (op) {
                    case "Insert":
                        int id = sc.nextInt();
                        sc.nextLine();
                        String book_name = sc.nextLine();
                        String book_author = sc.nextLine();
                        int year = sc.nextInt();
                        PreparedStatement preparedStatement = conn.prepareStatement("insert into Books values(?,?,?,?)");
                        preparedStatement.setInt(1, id);
                        preparedStatement.setString(2, book_name);
                        preparedStatement.setString(3, book_author);
                        preparedStatement.setInt(4, year);
                        preparedStatement.executeUpdate();
                        stmt = conn.createStatement();
                        System.out.println("Book Inserted");
                        break;
                    case "Delete":
                        id = sc.nextInt();
                        PreparedStatement preparedStatement1 = conn.prepareStatement("DELETE FROM Books WHERE book_id = ?");
                        preparedStatement1.setInt(1, id);
                        preparedStatement1.executeUpdate();
                        System.out.println("Book Deleted");
                        break;
                    case "Search":
                        id = sc.nextInt();
                        ResultSet resultSet = stmt.executeQuery("select * from books where book_id="+id);
                        while (resultSet.next()) {
                            int b_id = resultSet.getInt("book_id");
                            String b_name = resultSet.getString("book_name");
                            String b_author = resultSet.getString("book_author");
                            String b_year = resultSet.getString("published_year");
                            System.out.println(b_id + " " + b_name + " " + b_author + " " + b_year);
                        }
                        break;
                    case "List":
                        String sql = "select * from Books";
                        PreparedStatement preparedStatement3 = conn.prepareStatement(sql);
                        ResultSet resultSet1 = preparedStatement3.executeQuery();
                        while (resultSet1.next()) {
                            int b_id = resultSet1.getInt("book_id");
                            String b_name = resultSet1.getString("book_name");
                            String b_author = resultSet1.getString("book_author");
                            String b_year = resultSet1.getString("published_year");
                            System.out.println(b_id + " " + b_name + " " + b_author + " " + b_year);
                        }
                        break;
                    case "Exit":
                        System.exit(0);
                        break;
                }
            }

        }
        catch(Exception e){
                e.printStackTrace();
        }
    }
}
