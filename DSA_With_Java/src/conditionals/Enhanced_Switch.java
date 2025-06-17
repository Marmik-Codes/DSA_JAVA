package conditionals;

import java.util.Scanner;

public class Enhanced_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fruit: ");
        String fruit = sc.next();

        switch (fruit){
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Red sweet fruit");
            case "grapes" -> System.out.println("Small sweet fruit");
            default -> System.out.println("Enter valid fruit");

        }
    }
}
