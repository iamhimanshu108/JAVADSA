package basics;

import java.util.Scanner;

public class scanner {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("age = "+ age);


        int a =10;
        int b = 20;
        System.out.println("before swapping +" +a + " " +b);

        int temp = a;
        a =b ;
        b= temp;

        System.out.println("after swapping +" +a + " " +b);


    }
}
