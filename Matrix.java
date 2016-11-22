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

    /**
     * Multiplies a rowNum of the matrix by the inputted scalar.
     * @param rowNum The rowNum number that is to be scaled.
     * @param scalar The number the rowNum elements will be sacled by.
     */
    public void scalarMultiplyRow(int rowNum, double scalar) {
        if (this.isSafeRowNum) {
            for (int i = 0; i < this.getColumnSize(); i++) {
                matrix[rowNum][i] *= scalar;
            }
        }
        //TODO add exception
    }

    /**
     * Returns a requested row.
     * @param rowNum The row that is wanted.
     * @return int array representing the row.
     */
    public int[] getRow(int rowNum) {
        if (isSafeRowNum(rowNum)) {
            int[] row = new int[this.getRowSize()];
            for (int i = 0; i < this.getColumnSize(); i++) {
                row[i] = matrix[rowNum][i];
            }
            return row;
        }
        //TODO add exception
    }

    /**
     * Returns if the row exists.
     * @param row The row number to be checked.
     */
    public boolean isSafeRowNum(int rowNum) {
        return row >= 0 && row <= this.getRowSize();
    }
}
