import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            result[i] = countSuccessfulPotions(potions, success / spells[i]);
        }

        return result;
    }

    private int countSuccessfulPotions(int[] potions, long target) {
        int index = 0;

        for(int i  = 0; i < potions.length; i++) {
            if(potions[i] <= target)
                index = i;

        }

        return potions.length - index - 1;
    }
}
