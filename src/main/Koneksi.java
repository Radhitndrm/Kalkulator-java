/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.sql.*;
/**
 *
 * @author Radhitya
 */
public class Koneksi {
    private Connection connect;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/kalkulator_java";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi(){
        if(connect == null){
            try{
                connect = DriverManager.getConnection(jdbcUrl,username,password);
                System.out.println("Koneksi db berhasil");
            }catch(SQLException e){
                System.out.println("Koneksi db gagal" + e);
                System.exit(0);
            }
        }
        return connect;
    }
    public static void main(String[] args) {
      Koneksi kon = new Koneksi();
      kon.getKoneksi();
        
    }
    
}
