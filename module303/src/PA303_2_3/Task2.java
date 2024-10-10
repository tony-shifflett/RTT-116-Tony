package PA303_2_3;

public class Task2 {
    public static void main(String[] args) {
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        int[] arr = {225, 1555, 32456};

        for (int num : arr){
            System.out.println();
            System.out.println(Integer.toBinaryString(num));
            num = num >> 2;
            System.out.println(num);
            System.out.println(Integer.toBinaryString(num));
        }
    }
}
