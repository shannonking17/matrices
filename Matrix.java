/**
 * Created by shannonking on 11/21/16.
 */
public class Matrix {
    private double[][] matrix;

    //This constructor takes an int for rows, int for columns, and an int array for input. It
    //will then construct a matrix of the given dimensions and input the values given by the
    //input array.
    public Matrix(int rows, int cols, int[] input) {
        matrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input[(i * rows) + j];
            }
        }
    }

}
