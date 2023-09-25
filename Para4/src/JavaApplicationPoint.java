import java.util.Scanner;

public class JavaApplicationPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты р1");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        Point p1 = new Point(a1, b1);
        Point p4 = new Point(3,5);
        System.out.println("Расстояние1 " + p1.dist(p4));
        System.out.println("Расстояние1 " + p1.dist(3, 4));
        System.out.println("Введите координаты p2");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        Point p2 = new Point(a1, b1);
        System.out.println("Введите координаты p3");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        Point p3 = new Point(a1, b1);
        Triangle t = new Triangle(p1, p2, p3);
        System.out.println("Периметр равен: " + t.getPerimetr());
        System.out.println("Площадь равна: " + t.getSquare());
    }
}
