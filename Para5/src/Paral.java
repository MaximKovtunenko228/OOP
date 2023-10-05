public class Paral extends Body{
    double a, b, c;

    public Paral(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double S() {
        return 2 * (a * b + b * c + a * c);
    }

    @Override
    double V() {
        return a * b * c;
    }

    @Override
    void print() {
        System.out.println("Параллелограмм = " + a + " " + b + " " + c);
    }
}
