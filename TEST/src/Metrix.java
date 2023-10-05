import java.util.Arrays;

public class Metrix {
    private int[][] matrix;
    public Metrix(int[][] matrix) {
        this.matrix = matrix.clone();
    }
    public int get(int x, int y) {
        return matrix[x][y];
    }
    public int[][] getMatrix() {
        return matrix.clone();
    }
    public void setMatrix(int x, int y, int value) {
        matrix[x][y] = value;
    }
    public int sum () {
        int res = 0;
        for(int i =0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix.length; ++j) {
                if(matrix[i][j] % 3 == 0 && ((i + j) % 2 == 0)) res+= matrix[i][j];
            }
        }
        return res;
    }
    public void zero () {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = i; j < matrix[i].length; ++j) {
                if(matrix[i][j]%2==0) matrix[i][j] = 0;
            }
        }
    }
    @Override
    public String toString() {
        String temp = "";
        for (int[] ints : matrix) {
            temp += "{";
            for (int k = 0; k < matrix[0].length; k++) {
                temp += ints[k];
                if (k != matrix.length - 1) temp += ",";
            }
            temp += "}\n";
        }
        return temp;
    }
}
