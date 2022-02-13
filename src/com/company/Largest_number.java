package com.company;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        System.out.println("Finding and printing Largest number");
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//                                              first method
//        int max = a;
//        if(b>a){
//            max=b;
//        }
//        if(c>a){
//            max=c;
//        }
//                                              second method
        int max = Math.max(Math.max(a,b),c);
        System.out.println(max);
    }
}