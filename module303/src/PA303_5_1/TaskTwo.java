package PA303_5_1;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n1 = intScanner.nextInt();
//        System.out.println();
        System.out.print("Enter a positive integer: ");
        int n2 = intScanner.nextInt();

        int gcd = 1;

        for (int k = 1; (k<=n1 && k<=n2); k++){
            if(n1%k==0 && n2%k==0){
                gcd = k;
            }
        }

        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is: " + gcd);

    }
}
