package BoardStorage.CodeStorage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class CoordinatesInput {
    public static List<Integer> read(){
        int x;
        int y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            Announcer.print("Prosíme zadejte hodnotu x");
            try {
                x = Integer.parseInt(reader.readLine());
                if (x <= 0){
                    Announcer.print("Omlouváme se, ale tabulka nepodporuje hodnotu 0 a menší");
                } else {
                    break;
                }
            } catch (Exception e) {
                Announcer.print("Omlouváme se, ale nejspíše byla omylem zadána písmena/o místo čísla");
            }
        }

        while (true){
            Announcer.print("Prosíme zadejte hodnotu y");
            try {
                y = Integer.parseInt(reader.readLine());
                if (y <= 0){
                    Announcer.print("Omlouváme se, ale tabulka nepodporuje hodnotu 0 a menší");
                } else {
                    break;
                }
            } catch (Exception e) {
                Announcer.print("Omlouváme se, ale nejspíše byla omylem zadána písmena/o místo čísla");
            }
        }
        return Arrays.asList(x, y);
    }
}
