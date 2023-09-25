public class Util {
    int a;

    public Util(int a) {
        this.a = a;
    }

    public static boolean isPrime(int n) {
        if (n < 1) return false;
        int counter = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) counter++;
        }
        return counter == 2;
    }
    public static boolean isSov(int n) {
        if (n < 6) return false;
        int temp = 0;
        for (int i = 1; i < n; ++i)
            if (n % i == 0) temp += i;
        return n == temp;
    }
}
