public class Shar extends Body{
    double r;

    public Shar(double r) {
        this.r = r;
    }

    @Override
    double S() {
        return 4 * Math.PI * r * r;
    }

    @Override
    double V() {
        return (double)(4/3) * Math.PI * r * r * r;
    }

    @Override
    void print() {
        System.out.println("Шар = " + r);
    }
}
