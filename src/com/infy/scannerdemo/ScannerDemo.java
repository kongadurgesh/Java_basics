package com.infy.scannerdemo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        int rollNo = inp.nextInt();
        System.out.println(rollNo);
        inp.close();
    }
}
