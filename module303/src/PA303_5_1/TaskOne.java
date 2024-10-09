package PA303_5_1;

public class TaskOne {
    public static void main (String[] args) {
        System.out.print("    ");
        for (int num = 1; num <= 12; num++) {
            System.out.printf("%4d", num);
        }
        System.out.println();
        System.out.println("    " + "----".repeat(12));
        for(int firstOperand = 1; firstOperand <= 12; firstOperand++){
            System.out.printf("%4d", firstOperand);
            for(int secondOperand = 1; secondOperand <= 12; secondOperand++){
                System.out.printf("%4d", firstOperand*secondOperand);
            }
            System.out.println();
        }
    }
}
