package BoardStorage;

import java.util.Arrays;
import java.util.List;

public class Coordinates {

    //top

    public static List<Integer> getTop(int x, int y, int coefficient){
        return Arrays.asList(x, y - coefficient);
    }

    public static List<Integer> getTopRight(int x, int y, int coefficient){
        return Arrays.asList(x + coefficient, y - coefficient);
    }

    public static List<Integer> getTopLeft(int x, int y, int coefficient){
        return Arrays.asList(x - coefficient, y - coefficient);
    }

    //mid

    public static List<Integer> getRight(int x, int y, int coefficient){
        return Arrays.asList(x + coefficient, y);
    }

    public static List<Integer> getLeft(int x, int y, int coefficient){
        return Arrays.asList(x - coefficient, y);
    }

    //bottom

    public static List<Integer> getBottom(int x, int y, int coefficient){
        return Arrays.asList(x, y + coefficient);
    }

    public static List<Integer> getBottomRight(int x, int y, int coefficient){
        return Arrays.asList(x + coefficient, y + coefficient);
    }

    public static List<Integer> getBottomLeft(int x, int y, int coefficient){
        return Arrays.asList(x - coefficient, y + coefficient);
    }
}
