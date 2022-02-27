package com.praveen;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        System.out.println("Enter the non-discounted price of item:");
        Scanner input = new Scanner(System.in);
        float original = input.nextFloat();
        System.out.println("Enter the discount rate as fraction:");
        float discount_rate = input.nextFloat();
        float discount_price = original * (1 - discount_rate);
        System.out.println("The discounted price is: " + discount_price);
    }
}


/*

**************************OUTPUT**************************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59371:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.ProductDiscount
Enter the non-discounted price of item:
784
Enter the discount rate as fraction:
0.16
The discounted price is: 658.56

Process finished with exit code 0

*/
