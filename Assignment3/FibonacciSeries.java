package com.praveen;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("Enter the number of terms of fibonacci series to process (>=1):");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1){
            System.out.println("0");
        }
        else if (n == 2){
            System.out.println("0 1");
        }
        else{
            int first = 0;
            int second = 1;
            System.out.print("0 1 ");
            int index = 2;
            while(index <= n){
                int total = first + second;
                System.out.print(total + " ");
                first = second;
                second = total;
                index += 1;
            }
        }
    }
}


/*

*******************OUTPUT*************************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=61242:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.FibonacciSeries
Enter the number of terms of fibonacci series to process (>=1):
13
0 1 1 2 3 5 8 13 21 34 55 89 144 233 
Process finished with exit code 0

*/
