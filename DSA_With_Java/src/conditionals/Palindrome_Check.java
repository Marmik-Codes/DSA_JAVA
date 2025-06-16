package conditionals;

import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        String cleaned = str.trim().toLowerCase();
        String reversed  = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
