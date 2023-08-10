public class Array_2DandOthers_419 {
    public int countBattleships(char[][] board) {
        int countRow = board.length;
        int countCol = board[0].length;
        int count = 0;
        for (int row=0; row<countRow; row++){
            for (int col=0; col<countCol; col++){
                if (board[row][col] != 'X') continue;
                if (row-1>=0 && board[row-1][col] == 'X') continue;
                if (col-1>=0 && board[row][col-1] == 'X') continue;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    }
}
