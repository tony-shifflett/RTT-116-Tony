package Homework303_7_1;

import java.lang.reflect.Array;

public class TaskOne {
    public static void main(String[] args) {
        int[] demoArray = new int[3];

        for (int i = 0; i<demoArray.length; i++) {
            demoArray[i] = i+1;
        }

        for (int i = 0; i < demoArray.length; i++) {
            System.out.println(demoArray[i]);
        }
    }
}
