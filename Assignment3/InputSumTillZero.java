package com.praveen;

import java.util.Scanner;

public class InputSumTillZero {
    public static void main(String[] args) {
        System.out.println("Keep entering numbers whose sum to be calculated. Program will terminate when 0 entered");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        float total = 0;
        while(num != 0){
            total += num;
            num = input.nextFloat();
        }
        System.out.println("The required sum is: " + total );
    }
}


/*

**********************OUTPUT**********************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59475:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.InputSumTillZero
Keep entering numbers whose sum to be calculated. Program will terminate when 0 entered
85.62
47.23
65.12
0
The required sum is: 197.97

Process finished with exit code 0

*/
