package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        /*Input s = abcabcbb
        abc
        bca
        cab
        abc
        bc
        cb
        b
         */

        int startIndex = 0;
        int endIndex = 0;
        int maxLength = 0;
        String s = "pwwkeww";
        List<Character> data = new ArrayList<>();
        while (endIndex < s.length()) {
            if (!data.contains(s.charAt(endIndex))) {
                data.add(s.charAt(endIndex));
                endIndex++;
                maxLength = Math.max(maxLength, data.size());
            } else {
                data.remove(Character.valueOf(s.charAt(startIndex)));
                startIndex++;
            }
        }
        System.out.print(maxLength);

    }
}
