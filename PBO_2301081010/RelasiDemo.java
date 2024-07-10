/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_2301081010;

/**
 *
 * @author Muhamad Farhan
 */
public class RelasiDemo 
{
   public static void main(String[] args)
   {
       //a few numbers
       int i = 37;
       int j = 42;
       int k = 42;
       System.out.println("Variabel Values.....");
       System.out.println(" i = " + i);
       System.out.println(" j = " + j);
       System.out.println(" k = " + k);
       
       //lebih besar dari 
       System.out.println("Greater Than.....");
       System.out.println(" i > j = " + ( i > j ));//false
       System.out.println(" j > i = " + ( j > i ));//true
       System.out.println(" k > j = " + ( k > j ));//false      
        
       //lebih besar ataw sama dengan 
       System.out.println("Greater Than or equel to.....");
       System.out.println(" i >= j = " + ( i >= j ));//false  
       System.out.println(" j >= i = " + ( j >= i ));//true  
       System.out.println(" k >= j = " + ( k >= j ));//true  
       
       //lebih kecil dari 
       System.out.println("Less Than.....");
       System.out.println(" i < j = " + ( i < j ));//
       System.out.println(" j < i = " + ( j < i ));//
       System.out.println(" k < j = " + ( k < j ));//
       
       //lebih kecl ataw sama dengan 
       System.out.println("Less than or equel to.....");
       System.out.println(" i <= j = " + ( i <= j ));//
       System.out.println(" j <= i = " + ( j <= i ));//
       System.out.println(" k <= j = " + ( k <= j ));//
       
        //sama dengan
       System.out.println("Equal to...");
       System.out.println("    i==j="+(i==j));//fasle
       System.out.println("    k==j="+(k==j));//true
        
        
        //tidak sama dengan
       System.out.println("Not equal to..");
       System.out.println("    i!=j="+(i!=j));
       System.out.println("    k!=j="+(k!=j));
   }
}
