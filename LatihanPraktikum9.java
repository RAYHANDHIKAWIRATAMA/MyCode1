/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanpraktikum;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class LatihanPraktikum9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Var
        int ttllapt, ttlbuku, ttlkotak, ttlhp;
        double laptop, buku, kotak, hp;
        
        //berat satuan
        laptop = 850.56;
        buku = 250.11;
        kotak = 25.31;
        hp = 200.00;  
        
        //Ket
        System.out.println("======Indeks Berat Bawaan=======");
        
        //input
        System.out.print("Jumlah Laptop : ");
        ttllapt = input.nextInt();
        double totallaptop = laptop * ttllapt;
        
        System.out.print("Jumlah Buku : ");
        ttlbuku = input.nextInt();
        double totalbuku = buku * ttllapt;
        
        System.out.print("Jumlah Kotak Pensil : ");
        ttlkotak = input.nextInt();
        double totalkotak = kotak * ttllapt;
        
        System.out.print("Jumlah Smarthphone : ");
        ttlhp = input.nextInt();
        double totalhp = hp * ttllapt;
        
        //Jumlah Berat
        double jumlahberat = totallaptop + totalbuku + totalkotak + totalhp ;
        
        if (jumlahberat >= 2000) {
            System.out.println ("--------------------------");
            System.out.println ("Indeks Berat Barang : 5");
        }else if (jumlahberat >= 1500 && jumlahberat < 2000 ) {
            System.out.println ("--------------------------");
            System.out.println ("Indeks Berat Barang : 4");
        }
        else if (jumlahberat >= 1000 && jumlahberat < 1500 ) {
            System.out.println ("--------------------------");
            System.out.println ("Indeks Berat Barang : 3");
        }
        else if (jumlahberat >= 500 && jumlahberat < 1000 ) {
            System.out.println ("--------------------------");
            System.out.println ("Indeks Berat Barang : 2");
        }
        else if (jumlahberat >= 0 && jumlahberat < 50 ) {
            System.out.println ("--------------------------");
            System.out.println ("Indeks Berat Barang : 1");
        }
        else if (jumlahberat == 0) {
            System.out.println ("--------------------------");
            System.out.println ("Indeks Berat Barang : 0");
        }
      
        if (jumlahberat > 2000) {
            System.out.println("Berat Barang melebihi ketentuan!");
        }else if (jumlahberat >= 0 && jumlahberat < 2000) {
            System.out.println("Berat Barang tidak melebihi ketentuan, amaan...");            
        }else if (jumlahberat < 0 ){
            System.out.println("ERROR! Tidak diperkenankan bilangan negatif!");
        }
        
    }
}
