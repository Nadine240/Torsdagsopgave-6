
public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);


        System.out.println("Arealet af cirklen: " + circle.getArea());
        System.out.println("Arealet af kvadratet: " + square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println("Samlet areal: " + shapeBuilder.getTotalArea());

    }
}