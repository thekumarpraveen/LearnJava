package com.praveen;

import java.util.Scanner;

public class ExponentialPower {
    public static void main(String[] args) {
        System.out.println("Enter the base:");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int result = 1;
        System.out.println("Enter the exponent:");
        int power = input.nextInt();
        for(int i = 1; i<=power; i += 1){
            result *= base;
        }
        System.out.println("The required result is: " + result);
    }
}


/*

*****************************OUTPUT*****************************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59986:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.ExponentialPower
Enter the base:
3
Enter the exponent:
5
The required result is: 243

Process finished with exit code 0

*/
