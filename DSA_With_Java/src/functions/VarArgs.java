package functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4);
        multiple(19,20,"Marmik","Patel");
//        String name = "Marmik";
//        greet(name);

    }

//    static void greet(String name) {
//        System.out.println(name);
//    }
    static void multiple(int a , int b , String ...v){
//        System.out.print(Arrays.toString(a));
//        System.out.print(Arrays.toString(b));
        System.out.print(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
