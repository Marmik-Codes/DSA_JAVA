package functions;

import java.util.Scanner;

public class Grade_display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks of Physics: ");
        int phy = sc.nextInt();

        System.out.print("Enter marks of Chemistry: ");
        int chem = sc.nextInt();

        double percentage = (double) (maths + phy + chem)/3;

        String result = display_grade(percentage);
        System.out.println("Result: " + result);

    }

     static String display_grade(double percentage) {
        if (percentage >91 && percentage <= 100){
            return "AA";
        } else if (percentage >81 && percentage <= 90) {
            return "AB";
        }else if (percentage >71 && percentage <= 80) {
            return "BB";
        }else if (percentage >61 && percentage <= 70) {
            return "BC";
        }else if (percentage >51 && percentage <= 60) {
            return "CD";
        }else if (percentage >41 && percentage <= 50) {
            return "DD";
        }else{
            return  "Fail";
        }

     }
}
