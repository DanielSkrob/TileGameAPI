package BoardStorage.TileStorage;

import BoardStorage.GameBoard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GameBoardRender {

    public void printNums(int x){
        System.out.print("    ");
        for (int i = 1; i <= x; i++) {
            if (i > 9){
                System.out.print(i + "    ");
            } else {
                System.out.print(i + "     ");
            }
        }
        System.out.println(" ");
    }

    public void printLines(int x){
        System.out.print("   ");
        for (int i = 1; i <= x; i++) {
            System.out.print("---   ");
        }
        System.out.println(" ");
    }

    public void printRow(int x, int y, HashMap<List<Integer>, Tile> tiles){

        if (y > 9){
            System.out.print(y);
        } else {
            System.out.print(y + " ");
        }
        for (int i = 1; i <= x; i++) {
            System.out.print("| " + getTileCharacter(i, y, tiles) + " | ");
        }
        System.out.println( );
    }

    private Character getTileCharacter(int x, int y, HashMap<List<Integer>, Tile> tiles){
        return tiles.get(Arrays.asList(x, y)).symbol();
    }
}
