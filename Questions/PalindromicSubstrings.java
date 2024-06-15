package Questions;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {
    public static List<String> allPalindromicSubstrings(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            result.add(s.substring(i, i + 1));
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                result.add(s.substring(i, i + 2));
            }
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    result.add(s.substring(i, j + 1));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abba";
        List<String> palindromes = allPalindromicSubstrings(input);

        System.out.println(palindromes);
    }
}
