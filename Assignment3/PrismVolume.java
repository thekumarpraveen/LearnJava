package com.praveen;

import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        System.out.println("Enter the height of the prism:");
        Scanner input = new Scanner(System.in);
        float h = input.nextFloat();
        System.out.println("Enter the width of the prism:");
        float b = input.nextFloat();
        System.out.println("Enter the length/depth of the prism:");
        float l = input.nextFloat();
        double volume = Math.round((0.5 * b * h) * l * 100)/100.0;
        System.out.println("The Volume of the prism is: " + volume);
    }
}


/*

**********************OUTPUT**********************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61939:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.PrismVolume
Enter the height of the prism:
8
Enter the width of the prism:
5
Enter the length/depth of the prism:
14
The Volume of the prism is: 280.0

Process finished with exit code 0

*/
