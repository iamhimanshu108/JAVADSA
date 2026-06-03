package basics;

import java.util.Scanner;

public class conditionals {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Valid Voter");
        }else {
            System.out.println("Minor");
        }
    }
}
