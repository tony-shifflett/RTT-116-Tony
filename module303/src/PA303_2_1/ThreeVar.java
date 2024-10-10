package PA303_2_1;

public class ThreeVar {
    public static void main(String[] args) {

        double coffee = 3.5;
        double greenTea = 2.25;
        double latte = 4.0;

        final double SALES_TAX = .08;

        double subTotal;
        double totalSale;

        subTotal = 3*coffee + 4*greenTea + 2*latte;
        totalSale = subTotal + subTotal*SALES_TAX;
        System.out.printf("%.2f", totalSale);

    }
}
