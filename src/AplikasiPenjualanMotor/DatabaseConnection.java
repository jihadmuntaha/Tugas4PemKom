/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPenjualanMotor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/db_jdrstore";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection(URL, URL, PASSWORD);
    }
    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, URL, PASSWORD);
            System.out.println("Koneksi Berhasil!");
        } catch (Exception e) {
            System.err.println("koneksi gagal: " + e.getMessage());
        }
        return connection;
    }
    
    public static void main(String[] args) {
        
    }
}