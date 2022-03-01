package com.praveen;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        System.out.println("Enter value of n (positive Integer): ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("Enter value of r (positive Integer):" );
        long r = input.nextLong();
        float nCr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("The value of nCr is: " + nCr);
    }
    public static long factorial(long a){
        long result = 1;
        long num = 1;
        while (num <= a){
            result *= num;
            num += 1;
        }
        return result;
    }
}

/*
*************************OUTPUT*************************
Enter value of n (positive Integer): 
15
Enter value of r (positive Integer):
9
The value of nCr is: 5005.0

Process finished with exit code 0
*/
