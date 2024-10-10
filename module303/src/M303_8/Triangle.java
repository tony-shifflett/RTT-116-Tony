package M303_8;

public class Triangle extends Shape{

    private double base;
    private double height;

    public double getBase(){return base;}
    public double getHeight(){return height;}

    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public Triangle(){}

}
