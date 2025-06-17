package conditionals;

import java.util.Scanner;

public class Area_Of_Isosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter equal sides: ");
        double a = sc.nextDouble();
        System.out.print("Enter Base: ");
        double b = sc.nextDouble();

        double h = Math.sqrt(a*a - (b/2) *(b/2));

        double area  = 0.5*b*h;
        System.out.println("Area: " + Math.round(area));
    }
}
