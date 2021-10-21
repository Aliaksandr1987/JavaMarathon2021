package day17;
public class Task2 {
    public static void main(String[] args) {
        String[][] gameBoard = new String[8][8];
        ChessBoard chessBoard = new ChessBoard(gameBoard);
        ChessPiece chessPiece = ChessPiece.EMPTY;
        ChessPiece chessPiece1 = ChessPiece.KING_BLACK;
        ChessPiece chessPiece2 = ChessPiece.KING_WHITE;
        ChessPiece chessPiece3 = ChessPiece.ROOK_BLACK;
        ChessPiece chessPiece4 = ChessPiece.ROOK_WHITE;
        ChessPiece chessPiece5 = ChessPiece.PAWN_BLACK;
        ChessPiece chessPiece6 = ChessPiece.PAWN_WHITE;
        ChessPiece chessPiece7 = ChessPiece.KNIGHT_BLACK;
        ChessPiece chessPiece8 = ChessPiece.BISHOP_BLACK;
        ChessPiece chessPiece9 = ChessPiece.QUEEN_BLACK;
        ChessPiece chessPiece10 = ChessPiece.QUEEN_WHITE;
        ChessPiece chessPiece11 = ChessPiece.BISHOP_WHITE;
        gameBoard[0][0] = chessPiece3.toString();
        gameBoard[0][5] = chessPiece3.toString();
        gameBoard[0][6] = chessPiece1.toString();
        gameBoard[1][1] = chessPiece4.toString();
        gameBoard[1][4] = chessPiece5.toString();
        gameBoard[1][5] = chessPiece5.toString();
        gameBoard[1][7] = chessPiece5.toString();
        gameBoard[2][0] = chessPiece5.toString();
        gameBoard[2][2] = chessPiece7.toString();
        gameBoard[2][6] = chessPiece5.toString();
        gameBoard[3][0] = chessPiece9.toString();
        gameBoard[3][3] = chessPiece11.toString();
        gameBoard[4][3] = chessPiece8.toString();
        gameBoard[4][4] = chessPiece6.toString();
        gameBoard[5][4] = chessPiece11.toString();
        gameBoard[5][5] = chessPiece6.toString();
        gameBoard[6][0] = chessPiece6.toString();
        gameBoard[6][3] = chessPiece10.toString();
        gameBoard[6][5] = chessPiece6.toString();
        gameBoard[6][7] = chessPiece6.toString();
        gameBoard[7][5] = chessPiece4.toString();
        gameBoard[7][6] = chessPiece2.toString();
       for (int i =0; i<8;i++){
           for (int j=0; j<8;j++){
               if (gameBoard[i][j] == null){
                   gameBoard[i][j] = chessPiece.toString();
               }
           }
       }
       chessBoard.print();
    }
}
