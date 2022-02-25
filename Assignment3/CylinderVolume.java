import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        System.out.println("Enter the height of the cylinder followed by the radius:");
        Scanner input = new Scanner(System.in);
        float height = input.nextFloat();
        float radius = input.nextFloat();
        float volume = (float) (Math.PI * Math.pow(radius, 2) * height);
        System.out.println("The volume of the cylinder is: " + volume);
    }
}


/*

*************************OUTPUT*************************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=55955:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\2\out\production\Java CylinderVolume
Enter the height of the cylinder followed by the radius:
4
3.5
The volume of the cylinder is: 153.93803

Process finished with exit code 0

*/
