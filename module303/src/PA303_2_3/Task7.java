package PA303_2_3;

public class Task7 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int sum = (++x) + y;
        System.out.println(sum);
        //reset x
        x--;
        sum = (x++) + y;
        System.out.println(sum);
    }
}
