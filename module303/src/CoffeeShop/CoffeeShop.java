package CoffeeShop;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {

    private Scanner scanner = new Scanner(System.in);

    public void start(){
        initProducts();
        printProductMenu();
    }

    private ArrayList<Product> products = new ArrayList<>();

    private void initProducts(){
        Product p1 = new Product("Small Coffee", 4.57, 0);
        products.add(p1);
        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);
        Product p3 = new Product("Cookie", 5.89, 0);
        products.add(p3);
        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);
    }

    private void printProductMenu(){
        for(Product p : products){
            System.out.println(products.indexOf(p)+1 +". " + p.getName() + " $" + p.getPrice());
        }
    }

    public static void main(String[] args) {

        CoffeeShop cs = new CoffeeShop();
        cs.start();

    }
}
