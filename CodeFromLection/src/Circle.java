public class Circle  extends Body{
    public Circle(int a) {
        super(a);
    }
    @Override double P() {
        return 2 * a * Math.PI;
    }
    @Override double S() {
        return a * a * Math.PI;
    }
    @Override public void print() {
        System.out.println("Окружность с радиусом");
        super.print();
        System.out.println();
    }
}
