package com.praveen;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println("Enter the initial meter reading:");
        Scanner input = new Scanner(System.in);
        float start = input.nextFloat();
        System.out.println("Enter the ending meter reading:");
        float end = input.nextFloat();
        float difference = end - start;
        System.out.println("Enter the per electricity unit cost:");
        float price = input.nextFloat();
        float cost = price * difference;
        System.out.println("The calculated bill is: " + cost);
    }
}

/*

*************************OUTPUT*************************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=56383:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.ElectricityBill
Enter the initial meter reading:
3325.456
Enter the ending meter reading:
3459.12
Enter the per electricity unit cost:
4.5
The calculated bill is: 601.4883

Process finished with exit code 0

*/
