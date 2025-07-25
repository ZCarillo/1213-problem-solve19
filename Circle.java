import java.awt.Color;

/**
This class represents a circle with a specific radius and color and provides methods to access properties 
and find the area
 * @author Zaheir Carillo
 * @version Spring 25
 */

public class Circle {  
    // private instance variable, not accessible from outside this class
    private double radius;
    private Color color;
    private double area;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }

    // 2nd constructor with given radius and color
  //  @param radius 
  //  @param color 
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for retrieving the color of a circle
    public Color getColor() {
        return color;
    }

    // A public method for retrieving the area of a circle
    public double getArea() {
        calculateArea();
        return area;
    }
    // A private method for computing the area of circle
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
