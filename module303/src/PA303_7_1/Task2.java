package PA303_7_1;

public class Task2 {

    public static int returnMidElement(){
        //This program returns the middle element of an array with an odd number of elements.
        //The assignment instructions do not specify how to handle an even-numbered array, which has no middle element.
        int[] arr = {13, 5, 7, 68, 2};
        return arr[(arr.length-1)/2];
    }

    public static void main(String[] args) {
       System.out.println(returnMidElement());

    }
}
