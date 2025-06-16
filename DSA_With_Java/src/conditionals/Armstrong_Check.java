package conditionals;

import java.util.Scanner;

public class Armstrong_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Armstrong number between "+ start + " to " + end+ " are: ");

        for (int num = start; num <= end ; num++) {
            if (isArmstrong(num)){
                System.out.print(num + " ");
            }
        }
        sc.close();
    }

    static boolean isArmstrong(int number){
        int original = number;
        int sum = 0;
        int power = String.valueOf(number).length();

        while (number> 0){
            int digit = number%10;
            sum += (int) Math.pow(digit,power);
            number/=10;

        }
        return original==sum;

    }
}
