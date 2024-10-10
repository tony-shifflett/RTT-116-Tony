package PA303_2_3;

public class Task1 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x<<1;
        // shifting by 1 will mutiply by 2, meaning that the value will be 4. 2 in binary is 10, so 4 will be 100.
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        int[] arr = {9, 17, 88};
        for(int num : arr){
            System.out.println();
            System.out.println(Integer.toBinaryString(num));
            num = num<<1;
            System.out.println(num);
            System.out.println(Integer.toBinaryString(num));
        }
    }
}
