/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_14_05_2024;

/**
 *
 * @author Muhamad Farhan
 */
public class DivByZero 
{
    public static void main(String[] args )
    {
        try {
            int angka = Integer.parseInt(args [20]);
    System.out.println(5 / angka);
    System.out.println("Cetak.");
            }   
     catch(ArrayIndexOutOfBoundsException ex) 
     {
        System.out.println("Argument tidak ada     :" + ex.getMessage());
     } 
     catch(ArithmeticException ex) 
     {
        System.out.println("Bagi dengan 0     :" + ex.getMessage());
     }    
     finally
     {
            System.out.println("Block Finally Setelah Exception");
     }
    }
}
    
