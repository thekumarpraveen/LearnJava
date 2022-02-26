package com.praveen;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factors' sum need to be found:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factor = 1;
        int total = 0;
        while(factor <= number){
            if (number % factor == 0){
                total += factor;
            }
            factor += 1;
        }
        System.out.println("The required sum is: " + total);
    }
}


/*

*****************************OUTPUT*****************************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59409:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.PrintFactors
Enter the number whose factors' sum need to be found:
94
The required sum is: 144

Process finished with exit code 0

*/
