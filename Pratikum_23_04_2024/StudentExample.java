/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum_23_04_2024;

/**
 *
 * @author Muhamad Farhan
 */
public class StudentExample {
    public static void printInfromation( Person p){
        if(p instanceof Student){
            System.out.println("Nama Mhasiswa  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
        
         if(p instanceof Employee){
            System.out.println("Nama Mhasiswa  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
    }
    public static void main(String[] args){
        Person ref;
        
        Student Alex = new Student();
        Alex.setName("Alex");
        Alex.setAddress("Padang");
        
        Employee Bambang = new Employee();
        Bambang.setName("Bambang");
        Bambang.setAddress("Bambang");
        
        //ref=Alex;
        //System.out.println("Nama Karyawan   :"+ref.getName());
        //System.out.println("Alamat Karyawan :"+ref.getAddress());
        
        //ref=Bambang;
        //System.out.println("Nama Mahasiswa   :"+ref.getName());
        //System.out.println("Alamat Mahasiswa :"+ref.getAddress());
        
       printInfromation(Alex);
       printInfromation(Bambang);
  
    }
      }

   
