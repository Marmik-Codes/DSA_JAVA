package conditionals;


import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int rem = 0;
        int ans = 0;
        while(num > 0){
            rem = num%10 ; // 123
            num/=10;

            ans = ans *10 + rem;
        }
        System.out.println( "Reversed: "+ ans);
    }
}
