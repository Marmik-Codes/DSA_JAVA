package conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fibonacci series to print: ");
        int n = sc.nextInt();

        int a = 0;
        int b =1;


        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i <n ; i++) {
            int sum = a+b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
