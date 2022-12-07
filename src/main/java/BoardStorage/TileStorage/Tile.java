package BoardStorage.TileStorage;

public class Tile implements TileTemplate{

    private char symbol;

    public Tile(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char symbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
