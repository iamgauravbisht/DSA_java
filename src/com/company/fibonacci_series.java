package com.company;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//                                                     first method
//        int a1=0;
//        int a2=1;
//        int a3=a1+a2;
//        System.out.println("Enter the no. of terms you want to print in fibonacci");
//        int b = in.nextInt();
//        System.out.println(a1);
//        System.out.println(a2);
//        for(int i=1 ; i<=(b-2); i++ ){
//            int a3=a1+a2;
//            System.out.println(a3);
//            a1=a2;
//            a2=a3;
//        }
//                                                     second method
        System.out.println("nth Term of fibonacci series");
        int n = in.nextInt();
        int count = 3;
        int a1=0;
        int a2=1;
        int temp = 0;
        while(count<=n){
            temp=a1+a2;
            a1=a2;
            a2=temp;
            count++;
        }
        System.out.println(temp);
    }
}
