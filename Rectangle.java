package Graphics;

public class Rectangle {   // Class name: Rectangle
    double length, breadth;

    // Constructor name must be exactly "Rectangle"
    public Rectangle(double len, double wid) {
        length = len;
        breadth = wid;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
