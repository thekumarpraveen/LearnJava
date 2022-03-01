package com.praveen;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Enter value of n (positive Integer): ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("Enter value of r (positive Integer):" );
        long r = input.nextLong();
        float nPr = factorial(n) / factorial(n - r);
        System.out.println("The value of nPr is: " + nPr);
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
******************************OUTPUT******************************
Enter value of n (positive Integer): 
15
Enter value of r (positive Integer):
9
The value of nPr is: 1.8162144E9

Process finished with exit code 0
*/
