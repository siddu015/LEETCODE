import java.util.*;

public class UniqueNumberOccurrences {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }


        Set<Integer> uniqueCounts = new HashSet<>(occurrenceMap.values());


        return uniqueCounts.size() == occurrenceMap.size();

    }
}
