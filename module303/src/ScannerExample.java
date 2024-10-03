import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("You entered " + x );

        System.out.println("Enter a double: ");
        double radius = scanner.nextDouble();
        System.out.println("The area of a circle with a radius " + (radius * radius * Math.PI) );
//        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("You entered " + name );
    }
}
