package com.company;

import java.util.Scanner;

public class Calculator_program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        it will work untill you press x or X
        while (true){
            int ans=0;
//            taking oprator from user
            System.out.println("Enter the operation");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                taking two numbers from user
                System.out.println("Enter Two numbers ");
                int a1 = in.nextInt();
                int a2 = in.nextInt();
                if (op == '+'){
                    ans=a1+a2;
                }
                if (op == '-'){
                    ans=a1-a2;
                }
                if (op == '*'){
                    ans=a1*a2;
                }
                if (op == '/'){
                    if (a2 != 0){
                        ans=a1/a2;
                    }else {
                        System.out.println("second number cannot be zero");
                    }
                }
                if (op == '%'){
                    ans=a1%a2;
                }
                System.out.println(ans);
            }else if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("invalid operation");
            }
        }
    }
}
