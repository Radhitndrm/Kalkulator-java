/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
/**
 *
 * @author Radhitya
 */
public class Crud {
   
    private String operator,bilangan1,bilangan2,status;
    private double hasil;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private ResultSet CRUDhasil;
    private Statement CRUDstat;
    private String CRUDquery;
    
    public Crud(){
        Koneksi connection = new Koneksi();
        CRUDkoneksi = connection.getKoneksi();
    }
    
    public void setBilangan1(String bilangan1){
        this.bilangan1 = bilangan1;
    }
    
    public String getBilangan1(){
        return bilangan1;
    }
    
    public void setBilangan2(String bilangan2){
        this.bilangan2 = bilangan2;
    }
    
    public String getBilangan2(){
        return bilangan2;
    }    
    
    public void setOperator(String operator){
        this.operator = operator;
    }
    
    public String getOperator(){
        return operator;
    }
    
    public void setHasil(double hasil){
        this.hasil = hasil;
    }
    
    public double getHasil(){
        return hasil;
    }
    
    public ResultSet tampilData(){
        CRUDquery = "select * from tbl_record";
        try { CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        }catch(Exception e){
            
        }
        return CRUDhasil;
    }
    
    public String simpanData(String bilangan1, String bilangan2,String operator, double hasil ){
        CRUDquery = "insert into tbl_record (bilangan1,bilangan2,operator,hasil) values  (?,?,?,?)";
        
        try{
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, bilangan1);
            CRUDpsmt.setString(2, bilangan2);
            CRUDpsmt.setString(3, operator);
            CRUDpsmt.setDouble(4, hasil);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            status = "Data berhasil disimpan";
        }catch (Exception e){
            System.out.println(e);
            status = "Data gagal disimpan";
        }
        return status;
    }
}
