package module304;

public class LoopExamples {
    public static void main(String[] args) {

        for (int count = 0; count < 10; count++) {
            System.out.println("For loop iteration " + count);
        }

        String[] strings = {"one", "two", "three", "four", "five"};
        //for (String string : strings) {}

        for (int pos = 0; pos < strings.length; pos++) {
            System.out.println("strings at position " + pos + " = " + strings[pos]);
        }
    }
}
