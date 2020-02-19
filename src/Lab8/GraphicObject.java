package Lab8;

public abstract class GraphicObject {
    private double x;
    private double y;

    //abstract method
    public abstract void findArea();

    //getter and setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    //to string
    @Override
    public String toString() {
        return "GraphicObject{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}//class
