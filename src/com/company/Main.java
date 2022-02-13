package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of times you want to print ");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
