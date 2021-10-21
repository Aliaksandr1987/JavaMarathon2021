package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece chessPiece = ChessPiece.PAWN_WHITE;
        ChessPiece chessPiece1 = ChessPiece.ROOK_BLACK;
        String[] task1 = new String[8];
        for (int i =0;i<4;i++){
            task1[i] = chessPiece.toString();
            System.out.print(task1[i]);
        }
        for (int j =4;j<8;j++){
            task1[j] = chessPiece1.toString();
            System.out.print(task1[j]);
        }


    }
}
