package functions;

import java.util.Scanner;
import java.util.function.Predicate;

public class MultiplePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start no: ");
        Integer a = sc.nextInt();
        System.out.println("Enter end no: ");
        Integer b = sc.nextInt();

        Predicate<Integer> isPrime = (no1) ->{
            boolean flag = true;
            for (int i = 2; i <no1 ; i++) {
                if (no1%i == 0){
                    flag = false;
                    break;
                }
            }
            return flag;
        } ;
        for (int i = a; i < b ; i++) {
            if (isPrime.test(i)) System.out.print(i + " ");
        }
    }
}
