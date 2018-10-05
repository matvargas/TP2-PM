
class Circle {
    private double radius;
    private String color;
    public Circle(){radius = 1.0; color = "red";}
    public Circle(double r){this(); this.radius = r; color = "red";}
    public double getRadius(){ return radius; }
    public double getArea(){ return radius*radius*Math.PI;}
}

public class TP2 {
    public static void main(String [] args) {
        Circle c1, c2;
        c1 = new Circle();
        c2 = new Circle(2.0);
        System.out.println("O circulo tem o raio de " + c1.getRadius()
                + " e area de " + c1.getArea());
        System.out.println("O circulo tem o raio de " + c2.getRadius()
                + " e area de " + c2.getArea());
    }
}
