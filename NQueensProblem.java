import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        NQueens(board, 0, n, result);
        return result;
    }

    public void NQueens(boolean[][] board, int row, int n, List<List<String>> result) {

        // base case: all queens placed
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (boolean[] r : board) {
                StringBuilder sb = new StringBuilder();
                for (boolean cell : r) {
                    sb.append(cell ? "Q" : ".");
                }
                temp.add(sb.toString());
            }
            result.add(temp);
            return;
        }

        // try placing queen in each column
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = true;
                NQueens(board, row + 1, n, result);
                board[row][col] = false; // backtrack
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col, int n) {

        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j]) return false;
        }

        return true;
    }
}
