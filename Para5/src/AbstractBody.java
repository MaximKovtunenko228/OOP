import java.util.Scanner;

public class AbstractBody {
    public static void main(String[] args) {
        Body[] b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int k = sc.nextInt();
        b = new Body[k];
        for (int i = 0; i < k; ++i) {
            System.out.println("1 - шар, 2 - паралеллограмм");
            int p = sc.nextInt();
            if (p == 1) {
                System.out.println("Введите r");
                double r = sc.nextDouble();
                Shar shar = new Shar(r);
                b[i] = shar;
            }
            if (p == 2) {
                System.out.println("Введите 3 стороны");
                double a = sc.nextDouble();
                double b1 = sc.nextDouble();
                double c = sc.nextDouble();
                Paral paral = new Paral(a, b1, c);
                b[i] = paral;
                }
            }
        for (int i = 0; i < k; ++k) {
            b[i].print();
            System.out.println("S = " + b[i].S() + " V = " + b[i].V());
        }
    }
}
