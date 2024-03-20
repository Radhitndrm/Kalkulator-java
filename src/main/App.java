/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Radhitya
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KalkulatorForm kf = new KalkulatorForm();
        kf.setLocationRelativeTo(null);
        kf.setVisible(true);
    }
    
    public static double hitung(Double bilangan1, Double bilangan2,String operator, String penanda){
        Double hasil = null;
        if(operator.equals("+")){
          hasil = penjumlahan(bilangan1, bilangan2);
          penanda = "Penjumlahan";
        }else if(operator.equals("-")){
            hasil = pengurangan(bilangan1, bilangan2);
            penanda = "Pengurangan";
        }else if(operator.equals("x")){
            hasil = perkalian(bilangan1,bilangan2);
            penanda = "Perkalian";
        }else if(operator.equals(":")){
            hasil = pembagian(bilangan1,bilangan2);
           penanda = "Pembagian";
        }
         return hasil;
    }
 
      public static double penjumlahan(double angka1, double angka2){
        return angka1 + angka2;
    }
    
     public static double pengurangan(double angka1, double angka2){
        return angka1 - angka2;
    }
     
      public static double perkalian(double angka1, double angka2){
        return angka1 * angka2;
    }
      
       public static double pembagian(double angka1, double angka2){
        return angka1 / angka2;
    }
       
     
}
