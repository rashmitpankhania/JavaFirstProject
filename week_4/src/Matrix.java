public class Matrix {
    private int[][] mat_arr;

    Matrix(int row, int col){
        mat_arr = new int[row][col];
    }

    Matrix(){
        mat_arr = new int[3][3];
    }

    Matrix(int[][] new_mat){
        this.mat_arr = new_mat;
    }

    Matrix(Matrix copy){
        this.mat_arr = copy.mat_arr;
    }

    public void setMat_arr(int[][] mat_arr) {
        this.mat_arr = mat_arr;
    }

    public void display(){
        for (int[] ints : mat_arr) {
            for (int n : ints)
                System.out.printf("%d ", n);
            System.out.print("\n");
        }
    }

    public int[][] add(int[][] mat2){
        int[][] res = new int[mat2.length][];
        for(int i=0;i<mat_arr.length;i++){
            for(int j=0;j<mat_arr[i].length;j++){
                res[i][j] = mat_arr[i][j] + mat2[i][j];
            }
        }
        return res;
    }

    // true if scalar
    boolean checkScalar(int[][] mat){
        int val = mat[0][0];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j && mat[i][j] != val)
                    return false;
                else if(mat[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    public long[][] multiply(int[][] r_mat){
        long[][] res = new long[mat_arr.length][];
        int rows_mat_array = mat_arr.length;
        int equal_row_col = mat_arr[0].length; // for multiplication 3*4 4*6 -> 3*6 4 will equal_row_col
        int cols_r_mat = r_mat[0].length;
        for(int i=0;i<rows_mat_array;i++){
            for(int j=0;j<cols_r_mat;j++){
                // i th row of the first matrix and j th col of the second
                long temp = 0;
                for(int k=0;k<equal_row_col;k++){
                    temp+=mat_arr[i][k]*r_mat[k][j];
                }
                res[i][j] = temp;

            }
        }
        return res;
    }
}
