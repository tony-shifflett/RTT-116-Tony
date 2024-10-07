package org.perscholas;

public class WrapperClassExample {

    public static void autobox(int x){
        System.out.println("Function called with " + x);
    }

    public static void main(String[] args) {
        int x = 5;
        Integer y = x;
        Integer z = Integer.valueOf(x);
    }
}
