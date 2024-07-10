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
import java.util.Random;
public class Proses_Array {
     public static void main(String[] args){
         Scanner in = new Scanner (System.in);
         Random rand = new Random();
         int i,j,n;
         int jum,max,min;
         int imax,imin;// indeks t4 max min berada
         float rata;
         
         System.out.print("Masukan Banyak Data : ");
         n =in.nextInt();//menjadi ukuran array
         int[] A= new int[n];//Buat array A dengan ukuran n

         //isai array A
         //System.out.println("\n~~~Mengisi Array A~~~);
         
         for(i=0;i<=n-1;i++){
             //System.out.print("Array["+i+"] = ");
             //A[i] = in.nextInt();
             A[i]=rand.nextInt(100)+1;//1-100
         }         
         
         //proses isi Array
         jum = A[0];
         max = A[0]; min = A[0];
         imax= 0; imin = 0;
             for(i=1;i<=n-1;i++){
             jum =jum+A[i];
             if(A[i]>max){
                 max=A[i];
                 imax=i;        
             } 
             if(A[i]<min){
                 min=A[i];
                 imin=i;
             }
         }
         rata = (float)jum/n;
         
         ///menampilkan isi array A
         System.out.println("\n~~~Menampilkan Isi Array A~~~");
         for(i=0;i<n;i++){
             System.out.print(A[i]+"\t");
         }
         //menampilkan isi array A
         System.out.println("\n~~~Menampilkan Isi Array A ganjl~~~");
         for(i=0;i<n;i++){
             if(A[i]%2!=0)
                 System.out.print(A[i]+"\t");
             //endif
         }
         
         //menampilkan isi array a 
         System.out.println("\n~~~Menampilkan Isi Array A pada indeks");
         for(i=0;i<n;i++){
             if(i%2!=0)
                 System.out.print(A[i]+"\t");
             //endif
         }
         System.out.println("\nJumlah          = "+jum);
         System.out.println("\nRata-Rata       = "+rata);
          System.out.println("\nNilai Terbesar = "+max+" pada indeks "+imax);
          System.out.println("\nNilai Terkecil = "+min+" pada indeks "+imin);
     }
    
}
