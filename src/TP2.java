
class Circle {
    private double radius;
    private String color;
    private double length;
    public Circle(){this.radius = 1.0; this.color = "red"; this.length = calculateLength(this.radius)}
    public Circle(double r){this(); this.radius = r; this.color = "red";}
    public Circle(double r, String s){this(); this.radius = r; this.color = s;}
    public double getRadius(){ return this.radius; }
    public double getColor(){ return this.color; }
    public double getArea(){ return radius*radius*Math.PI;}
    public void setRadius(double radius) {this.radius = radius;}
    public void setColor(String color) {this.color = color};
    private double calculateLength(double radius){return 2*radius*Math.PI;}
    public String toString(){ return "Circulo: raio = " + radius + " cor = " + color};
}

public class Point {
    private float x, y;
    public float getX(){return this.x};
    public float getY(){return this.y}
    public setCoordinates(float x, float y){this.x = x; this.y = y;}
    public String toString(){ return "Centro nas coordenadas = " + this.x + "," + this.y};
}

public class TP2 {
    public static void main(String [] args) {
        Circle c1, c2, c3;
        c1 = new Circle();
        c2 = new Circle(2.0);
        c3 = new Circle(3.0, purple);
        System.out.println("O circulo tem o raio de " + c1.getRadius()
                + " e area de " + c1.getArea());
        System.out.println("O circulo tem o raio de " + c2.getRadius()
                + " e area de " + c2.getArea());
    }
}
