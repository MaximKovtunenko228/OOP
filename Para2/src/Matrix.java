import java.util.Random;

public class Matrix {
    private int[][] mat;

    public Matrix(int[][] mat) {
        this.mat = mat.clone();
    }

    public Matrix(int n) {
        mat = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                mat[i][k] = random.nextInt(50);
            }
        }
    }

    public int[][] getMat() {
        return mat.clone();
    }

    public void set(int x, int y, final int value) {
        mat[x][y] = value;
    }

    public int get(int x, int y) {
        return mat[x][y];
    }

    public int sumProGl() {
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int k = i; k < mat[i].length; k++) {
                if (Util.isPrime(mat[i][k])) res += mat[i][k];
            }
        }
        return res;
    }

    public void z2() {
        int counter;
        for (int i = 0; i < mat.length; i++) {
            counter = 0;
            for (int n : mat[i]) {
                if (Util.isSov(n)) {
                    counter += n;
                }
            }
            if (counter >= 2) {
                for (int k = 0; k < mat[i].length; k++) {
                    if (mat[i][k] % 2 == 0) mat[i][k] = 0;
                }
            }
        }
    }

    public int z3(int n) {
        int res = 1;
        for (int i = 0, split = 0; i < split; i++, split++) {
            for (int k = 0; k < split; k++) {
                if (mat[i][k] > n) res *= mat[i][k];
            }
        }
        return res;
    }

    public int prSov() {
        int res = 1;
        for (int[] ints : mat) {
            for (int n : ints) {
                if (Util.isSov(n)) {
                    res *= n;
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int[] ints : mat) {
            temp += "{";
            for (int k = 0; k < mat[0].length; k++) {
                temp += ints[k];
                if (k != mat.length - 1) temp += ",";
            }
            temp += "}\n";
        }
        return temp;
    }
}