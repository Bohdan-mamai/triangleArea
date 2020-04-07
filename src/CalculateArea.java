import java.awt.*;

public class CalculateArea {

    private Point A = new Point(24, 32);
    private Point B = new Point(11, 17);
    private Point C = new Point(58, 45);


    private float triangleArea(Point A, Point B, Point C) {
        float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
        if (area == 0){
            throw new NumberFormatException("Area could not be calculated.");
        }
        return Math.abs(area);
    }

    void display(){
        System.out.println("Triangle area = " + triangleArea(A, B, C) + "cm");
    }

}
