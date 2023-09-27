public abstract class Body {
    int a;

    public Body(int a) {
        this.a = a;
    }
    abstract double S();
    abstract double P();
    public void print() {
        System.out.println(a + "");
    }
}
