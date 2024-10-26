package Medium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> characterHashMap = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char curChar = s.charAt(right);

            if (characterHashMap.containsKey(curChar) && characterHashMap.get(curChar) >= left) {
                left = characterHashMap.get(curChar) + 1;
            }

            characterHashMap.put(curChar, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(line);

        System.out.println(result);
    }
}
