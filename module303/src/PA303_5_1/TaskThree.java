package PA303_5_1;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner tutitionScanner = new Scanner(System.in);
        System.out.println("Enter the cost of tuition: ");
        double tuition = tutitionScanner.nextDouble();

        double doubledTuitiion = tuition*2;
        int years = 0;

        while (tuition < doubledTuitiion){
            tuition *= 1.07;
            years++;
        }
        System.out.println("The tuition will double in " + years + " years");

    }
}
