package com.praveen;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the sale price: ");
        Scanner input = new Scanner(System.in);
        float s_price = input.nextFloat();
        System.out.println("Enter the commission percentage: ");
        float commission_rate = input.nextFloat();
        float commission_amount = s_price * (commission_rate / 100);
        System.out.println("The calculated commission amount is: " + commission_amount);
    }
}


/*

**********************OUTPUT**********************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=60005:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.CommissionCalculator
Enter the sale price: 
48.4897
Enter the commission percentage: 
3.54
The calculated commission amount is: 1.7165353

Process finished with exit code 0

*/
