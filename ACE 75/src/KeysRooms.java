import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        var size = rooms.size() - 1;

        Set<Integer> keysSet = new HashSet<>();

        for(var room: rooms) {
            for (var key: room) {
                if(key == 0) continue;
                keysSet.add(key);
            }
        }

        var sum = 0;
        for(var key: keysSet)
            sum += key;

        var sumOfDoorNumbers = (size * (size + 1) )/ 2;
        if(sum == sumOfDoorNumbers) return true;

        return false;
    }
}
