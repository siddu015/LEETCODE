import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var ass = new AsteroidCollision();
        int[] arr =  {10,2, -5};
        var result = ass.asteroidCollision(arr);

        System.out.println(Arrays.toString(result));

    }
}