package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-11-12 11:11
 **/
public class T3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                sb.delete(0, sb.indexOf(String.valueOf(ch)) + 1);
            } else {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            sb.append(ch);
            len = Math.max(len, sb.length());
        }
        return len;
    }
}
