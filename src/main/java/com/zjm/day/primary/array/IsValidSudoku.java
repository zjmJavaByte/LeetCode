package com.zjm.day.primary.array;

import java.util.HashMap;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 17:20 2021/5/25
 * @Modified By:
 */
public class IsValidSudoku {

    public static void main(String[] args) {
        char board[][] = {{'5','3','.','.','7','.','.','.','.'}, {'6','.','.','1','9','5','.','.','.'}, {'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};

        boolean validSudoku = isValidSudoku3(board);
        System.out.println(validSudoku);

    }



    public static boolean isValidSudoku(char board[][]) {
        int length = board.length;
        //二维数组line表示的是对应的行中是否有对应的数字，比如line[0][3]
        //表示的是第0行（实际上是第1行，因为数组的下标是从0开始的）是否有数字3
        int line[][] = new int[length][length];
        int column[][] = new int[length][length];
        int cell[][] = new int[length][length];
        for (int i = 0; i < length; ++i)
            for (int j = 0; j < length; ++j) {
                //如果还没有填数字，直接跳过
                if (board[i][j] == '.')
                    continue;
                //num是当前格子的数字减1
                int num = board[i][j] - '0' - 1;
                //k是第几个单元格，9宫格数独横着和竖着都是3个单元格
                int k = i / 3 * 3  + j / 3;
                //如果当前数字对应的行和列以及单元格，只要一个有数字，说明冲突了，直接返回false。
                //举个例子，如果line[i][num]不等于0，说明第i（i从0开始）行有num这个数字。
                if (line[i][num] != 0 || column[j][num] != 0 || cell[k][num] != 0)
                    return false;
                //表示第i行有num这个数字，第j列有num这个数字，对应的单元格内也有num这个数字
                line[i][num] = column[j][num] = cell[k][num] = 1;
            }
        return true;
    }

        public boolean isValidSudoku2(char[][] board) {
            // init data
            HashMap<Integer, Integer>[] rows = new HashMap[9];
            HashMap<Integer, Integer> [] columns = new HashMap[9];
            HashMap<Integer, Integer> [] boxes = new HashMap[9];
            for (int i = 0; i < 9; i++) {
                rows[i] = new HashMap<Integer, Integer>();
                columns[i] = new HashMap<Integer, Integer>();
                boxes[i] = new HashMap<Integer, Integer>();
            }

            // validate a board
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char num = board[i][j];
                    if (num != '.') {
                        int n = (int)num;
                        int box_index = (i / 3 ) * 3 + j / 3;

                        // keep the current cell value
                        rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                        columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
                        boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

                        // check if this value has been already seen before
                        if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1)
                            return false;
                    }
                }
            }
            return true;
        }

    public static boolean isValidSudoku3(char board[][]) {
        int[][] column = new int[9][9];
        int[][] line = new int[9][9];
        int[][] cell = new int[9][9];

        int length = board.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                char c = board[i][j];
                if (c == '.'){
                    continue;
                }
                int num = c - '0' - 1;

                int key = i / 3 * 3 + j / 3;

                if (column[i][num] != 0 || line[j][num] != 0 || cell[key][num] != 0 ){
                    return false;
                }

                column[i][num] = line[j][num] = cell[key][num] = 1;
            }

        }
        return true;


    }
}
