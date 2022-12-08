package BoardStorage;

import BoardStorage.CodeStorage.Announcer;
import BoardStorage.TileStorage.GameBoardRender;
import BoardStorage.TileStorage.Tile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GameBoard implements GameBoardTemplate{

    private final HashMap<List<Integer>, Tile> tiles = new HashMap<>();

    private final int x;
    private final int y;

    public GameBoard(int x, int y, char defaultChar) throws Exception {

        if (Arrays.asList(x, y).contains(0)){
            throw new Exception("Tabulka nemůže být nulová");
        }

        this.x = x;
        this.y = y;
        generateTiles(defaultChar);
    }

    private void generateTiles(char defaultChar){
        for (int i = 1; i <= y; i++){
            for (int j = 1; j <= x; j++){
                tiles.put(Arrays.asList(j, i), new Tile(defaultChar));
            }
        }
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    public HashMap<List<Integer>, Tile> getTiles() {
        return tiles;
    }

    public void setTile(int x, int y, char symbol) throws Exception {
        if (x > x() || y > y()){
            throw new Exception("Byly zadány moc vysoké hodnoty - mimo pokrytí tabulky");
        }

        getTiles().get(Arrays.asList(x, y)).setSymbol(symbol);
    }

    public Character getTile(int x, int y){
        return tiles.get(Arrays.asList(x, y)).symbol();
    }

    public void printBoard(){
        Announcer.print("Bude vykreslena hrací plocha o velikosti - " + x + " : " + y);
        GameBoardRender render = new GameBoardRender();
        render.printNums(x);
        render.printLines(x);

        for (int i = 1; i <= y; i++) {
            render.printRow(x, i, tiles);
            render.printLines(x);
        }
    }
}
