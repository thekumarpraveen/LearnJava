import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the sphere: ");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        double volume = Math.round(((4 * Math.PI * Math.pow(radius, 3) * 100)/3.0))/100.0 ;
        System.out.println("The volume of the sphere is: " + volume);

    }
}


/*

**********************OUTPUT**********************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=55222:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\2\out\production\Java SphereVolume
Enter the radius of the sphere: 
15.4
The volume of the sphere is: 15298.57

Process finished with exit code 0

*/
