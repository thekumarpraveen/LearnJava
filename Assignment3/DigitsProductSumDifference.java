package com.praveen;

import java.util.Scanner;

public class DigitsProductSumDifference {
    public static void main(String[] args) {
        System.out.println("Enter the number to calculate digits' product and sum difference:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int product = 1;
        while(number/10 != 0 ){
            int digit = number % 10;
            number = number / 10;
            sum += digit;
            product *= digit;
        }
        product *= number;
        sum += number;
        System.out.println("Sum: " + sum + ", Product " + product);
        System.out.println("The required difference is: " + (product - sum));
    }
}


/*

************************ OUTPUT *****************************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59338:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.DigitsProductSumDifference
Enter the number to calculate digits' product and sum difference:
212358
Sum: 21, Product 480
The required difference is: 459

Process finished with exit code 0


*/
