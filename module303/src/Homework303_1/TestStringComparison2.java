package Homework303_1;

//I know the name doesn't follow convention, but the instructions called for it to be named this way
public class TestStringComparison2 {
    public static void main(String args[]){
        String s1="Perscholas";
        String s2="Perscholas";
        String s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
    }

}