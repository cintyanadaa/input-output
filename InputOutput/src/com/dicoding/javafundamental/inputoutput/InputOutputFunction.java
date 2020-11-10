/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;
/**
 *
 * @author Sindy
 */
public class InputOutputFunction {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
    System.out.println("Program penjumlahan sederhana");
    System.out.print("masukan angka pertama = ");
    int value = Scanner.nextInt();
    System.out.print("masukan angka kedua = ");
    int anotherValue = Scanner.nextInt();
    int result = value + anotherValue;
    System.out.println("hasilnya adalah : "+result);
}
    
}
