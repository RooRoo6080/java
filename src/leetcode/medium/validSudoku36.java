package leetcode.medium;

import java.util.HashMap;

public class validSudoku36 {
    public static boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> used = new HashMap<>();
        for (char[] i : board) {
            used.put('1', 0);
            used.put('2', 0);
            used.put('3', 0);
            used.put('4', 0);
            used.put('5', 0);
            used.put('6', 0);
            used.put('7', 0);
            used.put('8', 0);
            used.put('9', 0);
            used.put('.', -9);
            for (char j : i) {
                used.put(j, used.get(j) + 1);
                if (used.get(j) > 1) return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            used.put('1', 0);
            used.put('2', 0);
            used.put('3', 0);
            used.put('4', 0);
            used.put('5', 0);
            used.put('6', 0);
            used.put('7', 0);
            used.put('8', 0);
            used.put('9', 0);
            used.put('.', -9);
            for (int j = 0; j < 9; j++) {
                char k = board[j][i];
                used.put(k, used.get(k) + 1);
                if (used.get(k) > 1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'1','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}