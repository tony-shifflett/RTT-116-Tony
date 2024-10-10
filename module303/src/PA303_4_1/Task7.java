package PA303_4_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    public static int getStatus(){

        Scanner taxStatusScanner = new Scanner(System.in);
        int status = 0;

        ArrayList<Integer> validStatus= new ArrayList<Integer>();
        validStatus.add(1);
        validStatus.add(2);
        validStatus.add(3);
        validStatus.add(4);

        System.out.println(
                "Which of the following describes your filing status?\n" +
                        "1. Single\n"+
                        "2. Married Filing Jointly, or Qualifying Widow(er)\n"+
                        "3. Married Filing Separately\n"+
                        "4. Head of Household\n"

        );

        try {
            status = taxStatusScanner.nextInt();
            taxStatusScanner.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Restarting.\n");
            return getStatus();
        }

        while(!validStatus.contains(status)){
            System.out.println("You have entered an invalid status. Please enter the number that corresponds to the correct status: ");
            try {
                status = taxStatusScanner.nextInt();
                taxStatusScanner.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Restarting.\n");
                return getStatus();
            }
        }


        return status;
    };

    public static double getIncome(){
        Scanner incomeScanner = new Scanner(System.in);
        System.out.print("Enter your household's annual income: $");
        return  incomeScanner.nextDouble();
    }

    public static double calculateTaxAmount(int status, double income){

        double taxAmount = 0;

        if (status == 1){
            if (income <= 8350){
                taxAmount = .10;
            }else if (income >= 8351 && income <= 33950){
                taxAmount = .15;
            }else if (income >= 33951 && income <= 82250){
                taxAmount = .25;
            }else if (income >= 82251 && income <= 171550){
                taxAmount = .28;
            }else if (income >= 171550 && income <= 372950){
                taxAmount = .33;
            }else if (income >= 372950){
                taxAmount = .35;
            }
        }
        else if (status == 2){
            if (income <= 16700){
                taxAmount = .10;
            }else if (income >= 16701 && income <= 67900){
                taxAmount = .15;
            }else if (income >= 67901 && income <= 137050){
                taxAmount = .25;
            }else if (income >= 137051 && income <= 208850){
                taxAmount = .28;
            }else if (income >= 208851 && income <= 372950){
                taxAmount = .33;
            }else if (income >= 372951){
                taxAmount = .35;
            }
        }
        else if (status == 3){
            if (income <= 16700){
                taxAmount = .10;
            }else if (income >= 16701 && income <= 67900){
                taxAmount = .15;
            }else if (income >= 67901 && income <= 137050){
                taxAmount = .25;
            }else if (income >= 137051 && income <= 208850){
                taxAmount = .28;
            }else if (income >= 208851 && income <= 372950){
                taxAmount = .33;
            }else if (income >= 372951){
                taxAmount = .35;
            }
        }
        else if (status == 4){
            if (income <= 16700){
                taxAmount = .10;
            }else if (income >= 16701 && income <= 67900){
                taxAmount = .15;
            }else if (income >= 67901 && income <= 137050){
                taxAmount = .25;
            }else if (income >= 137051 && income <= 208850){
                taxAmount = .28;
            }else if (income >= 208851 && income <= 372950){
                taxAmount = .33;
            }else if (income >= 372951){
                taxAmount = .35;
            }
        }

        return taxAmount;
    }

    public static void main(String[] args) {

        int status = getStatus();
        double income = getIncome();
        double taxAmount = calculateTaxAmount(status, income);

        double taxBill = income*taxAmount;

        System.out.println("You will owe $" + taxBill +" this year.");
    }
}
