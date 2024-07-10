/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_2301081010;

/**
 *
 * @author Muhamad Farhan
 */
import java.util.Scanner;
public class Nama_Bulan {
     public static void main(String[] args){
         int nobulan;
         char ulang;
         Scanner in = new Scanner (System.in);
         System.out.println("~~~MENENTUKAN NAMA BULAN~~~");
         
         do{
             System.out.print("Nomor Bulan = ");
             nobulan = in.nextInt();
             switch (nobulan)
             {
                 case 1 : System.out.println("Bulan Januari");break;
                 case 2 : System.out.println("Bulan Februari");break;
                 case 3 : System.out.println("Bulan Maret");break;
                 case 4 : System.out.println("Bulan April");break;
                 case 5 : System.out.println("Bulan Mei");break;
                 case 6 : System.out.println("Bulan juni");break;
                 case 7 : System.out.println("Bulan juli");break;
                 case 8 : System.out.println("Bulan agustus");break;
                 case 9 : System.out.println("Bulan september");break;
                 case 10 : System.out.println("Bulan oktober");break;
                 case 11 : System.out.println("Bulan november");break;
                 case 12 : System.out.println("Bulan desember");break;
             }
             System.out.print("Ulang Proses (Y/T)?");
             ulang = in.next().charAt(0);
         }while(ulang=='y'||ulang=='Y');
     }    
}
