package PA303_7_1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);

        String[] newArr = arr.clone();
        System.out.println(Arrays.toString(newArr));
    }
}
