public class Candy {
    public int candy(int[] ratings) {

        int len = ratings.length;
        int[] candy = new int[len];
        for (int i = 0; i < len; i++) {
            candy[i] = 1;
        }

        int candySum = 0;
        for (int i = 1; i < len; i++)
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;

        for (int i = len - 2; i > 0; i--)
            if (ratings[i] > ratings[i + 1])
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);

        for(var can: candy){
            candySum += can;
        }

        return candySum;
    }
}
