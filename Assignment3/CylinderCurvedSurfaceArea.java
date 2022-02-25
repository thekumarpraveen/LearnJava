import java.util.Scanner;

public class CylinderCurvedSurfaceArea {
    public static void main(String[] args) {
        System.out.println("Enter the details of Cylinder\n1)Radius 2)Height");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float height = input.nextFloat();
        double csa = 2 * Math.PI * radius * height;
        System.out.println("The curved surface area of the cylinder is: " + csa);
    }
}


/*

**************************OUTPUT**************************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=50396:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\2\out\production\Java CylinderCurvedSurfaceArea
Enter the details of Cylinder
1)Radius 2)Height
15.6 21.4
The curved surface area of the cylinder is: 2097.578596850533

Process finished with exit code 0

*/
