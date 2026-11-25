/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectors;

/**
 *
 * @author felipe
 */
import java.sql.*;

public class JDBCmysql {
    public static void main(String[] args) {
        String name = args[0];
        String email = args[1];
        String user = "root";
        String pass = "Draco#1984";
        String url = "jdbc:mysql://localhost:3306/db_hibernate";
        Connection conexion;
        Statement statement;
//        ResultSet rs;
        System.out.println(args[0]+args[1]);
        System.out.println("insert into users(nameuser, emailuser) value('"+ name +"', '"+ email + "')");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.getLogger(JDBCmysql.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url, user, pass);
            statement = conexion.createStatement();
            statement.executeUpdate("insert into users(nameuser, emailuser) value('"+ name +"', '"+ email + "')");
//            rs = statement.executeQuery("select * from users");
//            rs.next();
//            do {
//                System.out.println(rs.getInt("userId")+" : "+rs.getString("userName"));
//            }while (rs.next());
            
        } catch (SQLException ex) {
            System.getLogger(JDBCmysql.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
}
