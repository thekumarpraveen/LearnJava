package com.praveen;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        System.out.println("Enter the height followed by the radius of the cone:");
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();
        float radius = input.nextFloat();
        double volume = Math.round((1/3.0)*Math.PI*(Math.pow(radius, 2))*height * 100)/100.0;
        System.out.println("The Volume of the cone is: " + volume );
    }
}


/*

***********************OUTPUT***********************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61890:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.ConeVolume
Enter the height followed by the radius of the cone:
17.2 5
The Volume of the cone is: 450.29

Process finished with exit code 0


*/
