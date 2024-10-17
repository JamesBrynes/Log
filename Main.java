import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient of x^2: ");
        int a = sc.nextInt();
        System.out.print("Enter coefficient of x: ");
        int b = sc.nextInt();
        System.out.print("Enter constant term: ");
        int c = sc.nextInt();
        double z, result1, result2;
        z = Math.pow(b,2)-4*a*c;
        result1 = (-b-Math.sqrt(z))/(2*a);
        result2 = (-b+Math.sqrt(z))/(2*a);
        if (z < 0)
        {
            System.out.print("Error!");
        }else if (result1 == result2)
        {
            System.out.print("The result is " + result1);
        }
        else{
            System.out.println("The first result is " + result1);
            System.out.println("The second result is " + result2);
        }
    }
}