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
public class Ganjil_Genap {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan Bulat= ");
        a = input.nextInt();
        if(a%2==0)
            System.out.println(a + "Merupakan Bilangan Genap");
        else//a mod 2=1
            System.out.println(a + "Merupkan Bilangan Ganjil");
        
    }
    
}
