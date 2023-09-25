public class Triangle {
    Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }
    public double getSide1() {
        return p1.dist(p2);
    }
    public double getSide2() {
        return p1.dist(p3);
    }
    public double getSide3() {
        return p2.dist(p3);
    }
    public double getSquare () {
        double p = getSide1() + getSide2() + getSide3()/2;
        return Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
    }
    public double getPerimetr() {
        return getSide1() + getSide2() + getSide3();
    }
}
