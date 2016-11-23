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
     * Subtracts or adds the rowTwo to the rowOne, given that both are valid.
     * @param rowOneNum The row that will be operated on.
     * @param rowTwoNum The row that will be subtracted or added to rowOne.
     * @param operator The operator, so if it is adding or subtracting.
     */
    public void rowOperation(int rowOneNum, int rowTwoNum, Operators operator) {
        if (this.isSafeRowNum(rowOneNum) {
            if (this.isSafeRowNum(rowTwoNum)) {
                double[] rowOne = getRow(rowOneNum);
                double[] rowTwo = getRow(rowTwoNum);

                for (int i = 0; i < this.getColumnSize(); i++) {

                    // Chaning the sign if row to is to be subtracted.
                    int modifiedNumTwo = rowTwo[i];
                    if (operator == Operators.SUBTRACT)
                        modifiedNumTwo *= -1;

                    matrix[rowOneNum][i] = rowOne[i] + modifiedNumTwo;
                }
            }
        }
    }

    /**
     * A simple matrix printer, to be used for debugging.
     */
    public void printToTerminal() {
        //TODO fix to have print line and trim
        for (int i = 0; i < vectors.length; i++) {
            System.out.print("|");
            for (int j = 0; j < vectors[0].length; j++) {
                System.out.print(vectors[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    /**
     * Turns the matrix into the transpose of it, if not a nxn matrix the dimension will be
     * different.
     */
    public void transpose() {
        // New matrix will be mxn instead of nxm
        double[][] tMatrix = new double[this.getColumnSize()][this.getRowSize()];

        for (int i = 0; i < this.getColumnSize(); i++) {
            for (int j = 0; j < this.getRowSize(); j++) {
                tMatrix[j][i] = matrix[i][j]; // a_01 will be a_10 and so on.
            }
        }

        matrix = tMatrix;
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

    public enum Operators {
        SUBTRACT, ADD;
    }
}
