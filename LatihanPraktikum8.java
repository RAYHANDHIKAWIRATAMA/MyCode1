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
public class LatihanPraktikum8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Var
        int bil;
        
        //input
        System.out.print("Masukkan Bilangan : ");
        bil = input.nextInt();
        
        //Kondisi
         if (bil % 5 == 0) {
             System.out.println("Program Started");
         }
         else {
             System.out.println("Program Halted");
        
    }
  }  
     
}
