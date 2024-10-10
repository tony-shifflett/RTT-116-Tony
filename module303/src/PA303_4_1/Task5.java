package PA303_4_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner gradeScanner = new Scanner(System.in);
        System.out.println("Enter a numerical grade value: ");
        double grade = gradeScanner.nextDouble();

        if (grade < 0 || grade >100){
            System.out.println("Out of range");
        }
        else if (grade >= 90 && grade <= 100){
            System.out.println("A");
        }
        else if (grade >= 80 && grade <= 89){
            System.out.println("B");
        }
        else if (grade >= 70 && grade <= 79){
            System.out.println("C");
        }
        else if (grade >= 60 && grade <= 69){
            System.out.println("D");
        }
        else if(grade < 60){
            System.out.println("F");
        }
    }
}
