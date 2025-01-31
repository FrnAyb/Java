public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of generic shape: " + shape.getArea());

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}

class Shape {
    public double getArea() {
        return 0.0; // Default implementation for generic shape
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
