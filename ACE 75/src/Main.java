import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var ass = new KeysRooms();
        int[][] arr = {{1,3},{3,0,1},{2},{0}};
        var result = ass.canVisitAllRooms(arr, 4);
        System.out.println(result);

    }
}