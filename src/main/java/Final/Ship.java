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

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }


    Cell cell1 = Cell.SHIP_CELL;
    Cell cell2 = Cell.ZONE_SHIP_CELL;

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

    public Ship_1(int x1, int y1,PlayingField playingField) {
        super(x1, y1,playingField);

    }



}
class Ship_2 extends Ship {

    public Ship_2(int x1, int y1, int x2, int y2,PlayingField playingField) throws ValidShip, EmptyCell {
        super(x1, y1, x2, y2,playingField);
        if ((x2 != x1 || y2 != y1 - 1) && (x2 != x1 + 1 || y2 != y1) && (x2 != x1 || y2 != y1 + 1) && (x2 != x1 - 1 || y2 != y1)) {throw new ValidShip();}
        if (x2 == x1 && y2 == y1){
            throw new EmptyCell();
        }
    }
}
class Ship_3 extends Ship {

    public Ship_3(int x1, int y1, int x2, int y2, int x3, int y3,PlayingField playingField) throws ValidShip, EmptyCell {
        super(x1, y1, x2, y2, x3, y3,playingField);
        if ((x2 != x1 || y2 != y1 - 1) && (x2 != x1 + 1 || y2 != y1) && (x2 != x1 || y2 != y1 + 1) && (x2 != x1 - 1 || y2 != y1) &&
                (x2 != x3 - 1 || y2 != y3) && (x2 != x3 || y2 != y3 - 1) && (x2 != x3 + 1 || y2 != y3) &&
                (x2 != x3 || y2 != y3 + 1)) {throw new ValidShip();}
        if (x2 == x1 && y2 == y1 || x2 == x3 && y2 == y3 || x1 == x3 && y1 == y3){
            throw new EmptyCell();
        }
    }
}
class Ship_4 extends Ship {

    public Ship_4(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4,PlayingField playingField) throws ValidShip, EmptyCell {
        super(x1, y1, x2, y2, x3, y3, x4, y4,playingField);
        if ((x2 != x1 || y2 != y1 - 1) && (x2 != x1 + 1 || y2 != y1) && (x2 != x1 || y2 != y1 + 1) && (x2 != x1 - 1 || y2 != y1) &&
                (x2 != x3 - 1 || y2 != y3) && (x2 != x3 || y2 != y3 - 1) && (x2 != x3 + 1 || y2 != y3) &&
                (x2 != x3 || y2 != y3 + 1) && (x3 != x4 - 1 || y3 != y4) && (x3 != x4 || y3 != y4 - 1) &&
                (x3 != x4 + 1 || y3 != y4) && (x3 != x4 || y3 != y4 + 1)) {throw new ValidShip();}
        if (x2 == x1 && y2 == y1 || x2 == x3 && y2 == y3 || x3 == x4 && y3 == y4 || x1 == x3 && y1 == y3 || x2 == x4 && y2 == y4 || x1 == x4 && y1 == y4){
            throw new EmptyCell();
        }

    }
}

