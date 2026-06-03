package basics;

import java.util.Scanner;

public class ternary {
    static void main() {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        // Nested ternary operator to find greatest
//        int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
//
//        System.out.println("Greatest number is: " + max);

//        int num1 = 10;
//        double num2 = num1 >= 10 ? num1 : -num1;
//
//        System.out.println("num2 = " + num2);

//        int a = 5, b = 10;
//        int result = (a > b) ? a + b : a - b;
//        System.out.println(result);


        int characters = 5;
        int story = 3;
        double movieRating = characters <= 4 ? 3 : story>1 ? 2 : 1;
        System.out.println(movieRating);
    }
}
