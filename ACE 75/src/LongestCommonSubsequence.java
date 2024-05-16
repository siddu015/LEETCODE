public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        return solvetab(text1,text2);
    }

    public int solvetab(String text1, String text2){
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=text1.length()-1; i>=0; i--){
            for(int j=text2.length()-1; j>=0; j--){
                int ans;
                if(text1.charAt(i)==text2.charAt(j))
                    ans = 1+dp[i+1][j+1];
                else
                    ans = Math.max(dp[i][j+1],dp[i+1][j]);
                dp[i][j]=ans;
            }
        }
        return dp[0][0];
    }
}
