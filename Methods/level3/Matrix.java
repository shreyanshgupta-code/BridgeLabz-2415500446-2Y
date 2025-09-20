import java.util.Random;
public class Matrix {
    public static double[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant = 0).");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant = 0).");
            return null;
        }
        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        inv[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        inv[0][2] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        inv[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        inv[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        inv[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);
        inv[2][0] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
        inv[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        inv[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = inv[i][j] / det;
            }
        }
        return transpose(inv);
    }
    public static void main(String[] args) {
        System.out.println("=== 2x2 Matrix ===");
        double[][] mat2 = generateRandomMatrix(2, 2);
        displayMatrix(mat2);
        System.out.println("Transpose:");
        displayMatrix(transpose(mat2));
        double det2 = determinant2x2(mat2);
        System.out.println("Determinant: " + det2);
        System.out.println("Inverse:");
        double[][] inv2 = inverse2x2(mat2);
        if (inv2 != null) displayMatrix(inv2);
        System.out.println("=== 3x3 Matrix ===");
        double[][] mat3 = generateRandomMatrix(3, 3);
        displayMatrix(mat3);
        System.out.println("Transpose:");
        displayMatrix(transpose(mat3));
        double det3 = determinant3x3(mat3);
        System.out.println("Determinant: " + det3);
        System.out.println("Inverse:");
        double[][] inv3 = inverse3x3(mat3);
        if (inv3 != null) displayMatrix(inv3);
    }
}
