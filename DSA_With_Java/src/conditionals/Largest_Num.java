package conditionals;

import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        First Method -1

//        int max = a;
//
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//
//       Second Method

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
