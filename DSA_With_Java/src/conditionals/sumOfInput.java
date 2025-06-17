package conditionals;


import java.lang.annotation.Native;
import java.util.Scanner;

public class sumOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int sum =0;
//
//        while (true){
//            System.out.print("Enter integer: ");
//            int a = sc.nextInt();
//            sum+=a;
//            if (a==0){
//                break;
//            }
//
//        }
//        System.out.println("Sum: " + sum);
        int max;
        while (true){
            System.out.print("Enter Two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            max = Math.max(a,b);
            System.out.println(max);
            if (a == 0 || b == 0){
                break;
            }
        }
    }
}
