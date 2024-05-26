public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int count;
        for(int i = 0; i < temperatures.length; i++) {
            count = 0;
            for(int j = i+1; j < temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]) {
                    count++;
                    break;
                }
                else
                    count++;
                if(j == temperatures.length-1)
                    count = 0;
            }
            result[i] = count;
        }

        result[temperatures.length - 1] = 0;

        return result;
    }
}
