package enumerated_types;

public enum  Direction {
    NORTH("północ",0),
    EAST("wschód",90),
    SOUTH("południe",180),
    WEST("zachód",270);

    private String polishName;
    private int degrees;

   private Direction(String polishName, int degrees) {
        this.polishName = polishName;
        this.degrees = degrees;
    }

    public String getPolishName() {
        return polishName;
    }

    public int getDegrees() {
        return degrees;
    }
}
