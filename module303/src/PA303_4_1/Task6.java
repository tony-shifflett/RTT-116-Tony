package PA303_4_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 7: ");
        int num = numScanner.nextInt();

        switch (num){
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}
