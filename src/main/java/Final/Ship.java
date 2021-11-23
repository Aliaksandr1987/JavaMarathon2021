package Final;


public class Ship {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;

    Cell cell1 = Cell.SHIP_CELL;
    Cell cell = Cell.EMPTY_CELL;

    public Ship(int x1, int y1,PlayingField field) {
        this.x1 = x1;
        this.y1 = y1;

    }
    public Ship(int x1, int y1, int x2, int y2,PlayingField field) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }
    public Ship(int x1, int y1, int x2, int y2, int x3, int y3,PlayingField field) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }
    public Ship(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4,PlayingField field) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;


    }

}

class Ship_1 extends Ship {

    public Ship_1(int x1, int y1,PlayingField playingField,String[][] field) throws EmptyCell {
        super(x1, y1,playingField);
        if (!field[x1][y1].equals(cell1.toString())){

            throw new EmptyCell();
        }

    }
}
class Ship_2 extends Ship {

    public Ship_2(int x1, int y1, int x2, int y2,PlayingField playingField,String[][] field) throws ValidShip, EmptyCell {
        super(x1, y1, x2, y2,playingField);
        if ((!field[x2][y2].equals(field[x2][y2-1])) &&
                !field[x2][y2].equals(field[x2-1][y2]))
        {field[x1][y1] = cell.toString();
            field[x2][y2] = cell.toString();
            throw new ValidShip();}
        if (x2 == x1 && y2 == y1){
            field[x1][y1] = cell.toString();
            field[x2][y2] = cell.toString();
            throw new EmptyCell();
        }

    }
}
class Ship_3 extends Ship {

    public Ship_3(int x1, int y1, int x2, int y2, int x3, int y3,PlayingField playingField, String[][] field) throws ValidShip, EmptyCell {
        super(x1, y1, x2, y2, x3, y3,playingField);
        if ((!field[x3][y3].equals(field[x3][y3-1]) || !field[x2][y2].equals(field[x2][y2-1])) &&
                (!field[x3][y3].equals(field[x3-1][y3]) || !field[x2][y2].equals(field[x2-1][y2])))
        {   field[x1][y1] = cell.toString();
            field[x2][y2] = cell.toString();
            field[x3][y3] = cell.toString();
            throw new ValidShip();}
        if (x2 == x1 && y2 == y1 || x2 == x3 && y2 == y3 || x1 == x3 && y1 == y3){
            field[x1][y1] = cell.toString();
            field[x2][y2] = cell.toString();
            field[x3][y3] = cell.toString();
            throw new EmptyCell();
        }


    }
}
class Ship_4 extends Ship {

    public Ship_4(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4,PlayingField playingField, String[][] field) throws ValidShip, EmptyCell {
        super(x1, y1, x2, y2, x3, y3, x4, y4,playingField);

        if ((!field[x4][y4].equals(field[x4][y4-1]) ||  !field[x3][y3].equals(field[x3][y3-1]) || !field[x2][y2].equals(field[x2][y2-1])) &&
                (!field[x4][y4].equals(field[x4-1][y4]) || !field[x3][y3].equals(field[x3-1][y3]) ||!field[x2][y2].equals(field[x2-1][y2])))
        {field[x1][y1] = cell.toString();
            field[x2][y2] = cell.toString();
            field[x3][y3] = cell.toString();
            field[x4][y4] = cell.toString();
            throw new ValidShip();}


        if (x2 == x1 && y2 == y1 || x2 == x3 && y2 == y3 || x3 == x4 && y3 == y4 || x1 == x3 && y1 == y3 || x2 == x4 && y2 == y4 || x1 == x4 && y1 == y4){
            field[x1][y1] = cell.toString();
            field[x2][y2] = cell.toString();
            field[x3][y3] = cell.toString();
            field[x4][y4] = cell.toString();
            throw new EmptyCell();}


    }
}
