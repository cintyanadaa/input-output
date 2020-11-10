/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.inputoutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sindy
 */
public class UserBufferedReader {
    public static void main(String[] args){
        InputStreamReader StreamReader = new InputStreamReader(System.in);
        BufferedReader BufferedReader = new BufferedReader(StreamReader);
        System.out.println("program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue = 0;
        try {
            System.out.print("masukan angka pertama : ");
            value = Integer.parseInt(BufferedReader.readLine());
            System.out.print("masukan angka kedua : ");
            anotherValue = Integer.parseInt(BufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.println("hasilnya adalah : " + resul );
        }
    
}
