public class Triangle1 extends Body {
    int b, c;

    public Triangle1(int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    @Override double Perim() {
        return a + b + c
    }
    @Override double S() {
        double p = P() / 2;
        return Math.sqrt(p * (p - a) * (p - a) * (p - c))
        }
    @Override
public void print() {
        System.out.println("Треугольник со сторонами");
        super.print();
        System.out.println(b + " " + c);
    }
}
