package com.company;

import java.util.Scanner;

public class Ocurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//                                                  first method
//        System.out.println("Enter the number");
//        String a = in.nextLine();
//        System.out.println("Enter the no. you want to check Ocurance of");
//        char b = in.nextLine().charAt(0);
//        int count=0;
//        for(int i=0; i<a.length() ;i++){
//            if(a.charAt(i)==b){
//                count++;
//            }
//        }
//        System.out.println(count);
//                                                  second method
        System.out.println("Enter the number");
        int a = in.nextInt();
        System.out.println("Enter the no. you want to check Ocurance of");
        int b = in.nextInt();
        int count = 0;
        while (a > 0) {
            int lastdigit = a % 10;
            if (lastdigit == b) {
                count++;
            }
            a/=10;
        }
        System.out.println(count);
    }
}
