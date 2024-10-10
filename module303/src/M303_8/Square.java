package M303_8;

public class Square {
    private int height;
    private int width;

    public Square(){}

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args){
        Square s1 = new Square();
        Square s2 = new Square(10, 20);
    }
}
