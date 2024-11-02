package com.ykhr.nnnday3_randomnumbergenerator;

import java.util.Scanner;
import java.util.Random;

public class NnnDay3_randomNumberGenerator {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan batas atas pertama: ");
        int num1 = scan.nextInt();
        
        System.out.print("Masukkan batas atas kedua: ");
        int num2 = scan.nextInt();
        
        Random rand = new Random();
        int randNum1 = rand.nextInt(num1);
        int randNum2 = rand.nextInt(num2);
        
        System.out.println("Angka Acak Pertama adalah : " + randNum1);
        System.out.println("Angka Acak Kedua adalah : " + randNum2);
    }
}
