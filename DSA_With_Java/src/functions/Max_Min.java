package functions;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        System.out.print("Enter num3: ");
        int c = sc.nextInt();

        int[] result = findMaxMin(a,b,c);
        System.out.println("Max num: " + result[0]);
        System.out.println("Min num: " +result[1]);

    }

    static int[] findMaxMin(int a, int b, int c) {
        int max = Math.max(c ,Math.max(a,b));
        int min = Math.min(c ,Math.min(a,b));

        return new int[]{max,min};
    }
}
