import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        int radiant = 0, dire = 0;
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();

        int len = 0;
        for(int i = 0; i < senate.length(); i++) {
            if(senate.charAt(i) == 'R') rad.add(i);
            else dir.add(i);
            len++;
        }

        while (!rad.isEmpty() && !dir.isEmpty()) {
            if(rad.peek() < dir.peek())
                rad.add(len++);
            else
                dir.add(len++);

            dir.poll();
            rad.poll();
        }

        return dir.isEmpty() ? "Radiant" : "Dire";

    }
}
