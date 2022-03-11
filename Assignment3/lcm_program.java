package com.praveen;

import java.util.Scanner;

public class lcm_program {
    public static void main(String[] args) {
        System.out.println("Enter the numbers of which you want to find LCM: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int lcm = 1;
        while(true){
            if (lcm%a == 0 && lcm %b ==0){
                break;
            }
            lcm += 1;
        }
        System.out.println("The LCM is: " + lcm);
    }
}

/*
**********************OUTPUT*****************************
Enter the numbers of which you want to find LCM: 
4564 65746
The LCM is: 150032372
*/
