package Final;

import java.util.Arrays;

public class PlayingField {
    private String[][] field;
    Cell cell = Cell.EMPTY_CELL;
    public PlayingField(String[][] field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return Arrays.toString(field);
    }
    public void print(){
        for (String[] n:field){
            for (String h:n){
                System.out.print(h);
            }
            System.out.println(" ");
        }
    }
}
