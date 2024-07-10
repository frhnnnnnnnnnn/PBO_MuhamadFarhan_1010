/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_18_05_2024;

/**
 *
 * @author Muhamad Farhan
 */
public class DecToOthersRecur {
    static void printBase(int num, int base){
        String digits = "0123456789abcdef";
        if (num >= base){
            printBase(num/base, base);
        }
        System.out.println(digits.charAt(num%base));
    }
    public static void main(String args[]){
        int num = 15;
        int base = 8;
        printBase(num,base);
    }
    
}
