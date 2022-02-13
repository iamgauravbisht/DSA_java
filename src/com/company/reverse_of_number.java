package com.company;

import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//                                                  first method
//        System.out.println("Enter the number");
//        String a = in.nextLine();
//        String reverse=" ";
//        for (int i=0;i<a.length();i++){
//            char ch=a.charAt(i);
//            reverse=ch+reverse;
//        }
//        System.out.println("Reverse of the number \n "+reverse);
//                                                  second method
        System.out.println("Enter the number");
        int a = in.nextInt();
        int reverse=0;
        while(a>0){
                int temp=a%10;
                reverse=reverse*10+temp;
                a/=10;
        }
        System.out.println("Reverse of the number \n "+reverse);
    }
}
