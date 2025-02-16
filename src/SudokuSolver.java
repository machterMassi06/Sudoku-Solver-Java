public class SudokuSolver {
    private static final int SIZE=9;

    //backtracking resolution
    public static boolean solve(int[][] puzzle){
        for(int r=0;r<SIZE;r++){
            for (c=0;c<SIZE;c++){
                // find the next empty box
                if(puzzle[r][c]==0){
                    for(int n=1;n<=SIZE;n++){
                        if (isSafe(puzzle,r,c,n)){
                            // not implemented yet
                        }
                    }
                }
            }
        }
    }

    // Check if a number can be placed in a box
    // Return True , if is not already present in its: row, column, 3*3 grid
    public static boolean isSafe(int[][] puzzle,int r,int c,int n){
        for(int k=0;k<SIZE;k++){
            if(puzzle[r][k]==n || puzzle[k][c]==n){
                return false;
            }
        }

        int startR=(r-r%3),startC=(c-c%3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (puzzle[startR+i][startC+j]==n){
                    return false;
                }
            }
        }
        return true;
    }
}
