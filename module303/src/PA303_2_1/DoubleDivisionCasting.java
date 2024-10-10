package PA303_2_1;

public class DoubleDivisionCasting {
    public static void main(String[] args) {
        double a = 22.5;
        double b = 66.43;
        double result = b / a;
        System.out.println(result);
        int newResult = (int)result;
        System.out.println(newResult);
    }
}
