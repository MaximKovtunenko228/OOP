public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a.length; ++j)
                
        }
        Metrix m = new Metrix(a);
        System.out.println(m.sum());
        m.zero();
        System.out.println(m.toString());
    }
}