import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;

        // Create two random matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        // Perform matrix operations
        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] difference = subtractMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);
        int[][] transpose1 = transposeMatrix(matrix1);

        // Calculate determinants
        int determinant2x2 = determinant2x2(matrix1);
        // int determinant3x3 = determinant3x3(matrix1); // Assuming matrix1 is 3x3

        // Calculate inverses
        int[][] inverse2x2 = inverse2x2(matrix1);
        // int[][] inverse3x3 = inverse3x3(matrix1); // Assuming matrix1 is 3x3

        // Print results
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        System.out.println("Sum:");
        printMatrix(sum);
        System.out.println("Difference:");
        printMatrix(difference);
        System.out.println("Product:");
        printMatrix(product);
        System.out.println("Transpose of Matrix 1:");
        printMatrix(transpose1);
        System.out.println("Determinant of Matrix 1 (2x2): " + determinant2x2);
        // System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3);
        System.out.println("Inverse of Matrix 1 (2x2):");
        printMatrix(inverse2x2);
        // System.out.println("Inverse of Matrix 1 (3x3):");
        // printMatrix(inverse3x3);
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random numbers between 0 and 9
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] difference = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return difference;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        int[][] product = new int[rows1][cols2];

        if (cols1 != rows2) {
            System.out.println("Cannot multiply matrices. Incorrect dimensions.");
            return null;
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return product;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Matrix is not a 2x2 matrix.");
            return 0;
        }

        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix (not implemented)

    // Method to find the inverse of a 2x2 matrix
    public static int[][] inverse2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Matrix is not a 2x2 matrix.");
            return null;
        }

        int determinant = determinant2x2(matrix);

        if (determinant == 0) {
            System.out.println("Matrix is singular. Inverse does not exist.");
            return null;
        }

        int[][] inverse = new int[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix (not implemented)

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}