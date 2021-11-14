package Final;

public enum Cell{
    EMPTY_CELL("⬜ "),SHIP_CELL("\uD83D\uDEE5 "),
    ZONE_SHIP_CELL( "☣ "),DEMAGE_CELL("\uD83D\uDFE5"),HIT_CELL(" ❌");
    private String stringDesidnation;
    Cell(String stringDesidnation) {
        this.stringDesidnation = stringDesidnation;
    }

    @Override
    public String toString() {
        return stringDesidnation;
    }
}
