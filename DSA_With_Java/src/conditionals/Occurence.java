package conditionals;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();
        int rem = 0;
        System.out.print(num + " " + "Enter which num occurence you want to find: ");
        int find = sc.nextInt();
        int count = 0;
        int temp = (int) num;
        while (num>0){
            rem =(int) num%10;
            if (rem == find){
                count++;
            }
            num/=10;

        }
        System.out.println(find + " " + "occur " + count + " times in " + temp );
    }
}
