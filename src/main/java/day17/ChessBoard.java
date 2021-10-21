package day17;

import java.util.Arrays;

public class ChessBoard {
    private String[][] board;
    public ChessBoard(String[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return Arrays.toString(board);
    }
public void print(){
    for (int i =0; i<8;i++){
        for (int j=0; j<8;j++){
            System.out.print(board[i][j]);
        }
        System.out.println(" ");
    }
}

}
