package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2Dexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
//        System.out.println(arr2D.length);
//        Input
        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
               arr2D[i][j] = sc.nextInt();
            }
        }


//        for (int i = 0; i < arr2D.length ; i++) {
//            for (int j = 0; j <arr2D[i].length ; j++) {
//                System.out.print(arr2D[i][j]+ " ");
//            }
//            System.out.println();
//        }


        // Simpler Way to Print
//        for (int i = 0; i < arr2D.length ; i++) {
//            System.out.println(Arrays.toString(arr2D[i]));
//        }


//        Enhanced For loop

//        for (int[] ints : arr2D) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();

//        More  Enhanced for loop
        for (int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }
    }
}
