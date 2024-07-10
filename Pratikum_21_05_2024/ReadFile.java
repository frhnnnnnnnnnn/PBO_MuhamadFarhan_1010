/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_21_05_2024;

/**
 *
 * @author Muhamad Farhan
 */

import java.io.*;
public class ReadFile {
    public static void main(String args[]) throws IOException {
        System.out.println("Nama file ayang akan dibaca");
        String filename;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Now reading from " + filename + "...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename); 
        } catch (FileNotFoundException ex){
            System.out.println("File not found");
        } 
        try{
            char data;
            int temp; 
            int temp1;
              
            do{
                temp = fis.read();
                temp1=temp;
                temp1=temp1 ^ 25;
                data = (char) temp1;
            if (temp != -1){
                System.out.print(data);
            }    
            }while (temp != -1);
        }catch (IOException ex){
            System.out.println("Problem in reading from the file");
        }
        
    }
}   