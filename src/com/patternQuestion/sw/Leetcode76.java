package com.patternQuestion.sw;

import java.util.HashMap;

public class Leetcode76 {
        public String minWindow(String s, String t) {
            int n = s.length();
            int low = 0, high = 0;
            int minLen = Integer.MAX_VALUE;
            int start = 0;
            int formed = 0;

            HashMap<Character, Integer> maps = new HashMap<>();
            HashMap<Character, Integer> mapt = new HashMap<>();

            // Count required characters in t
            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);
                mapt.put(ch, mapt.getOrDefault(ch, 0) + 1);
            }

            while (high < n) {
                char ch = s.charAt(high);
                maps.put(ch, maps.getOrDefault(ch, 0) + 1);

                // Check whether this character satisfies its requirement
                if (mapt.containsKey(ch)
                        && maps.get(ch).intValue() == mapt.get(ch).intValue()) {
                    formed++;
                }

                // Shrink while the window is valid
                while (formed == mapt.size()) {
                    int len = high - low + 1;

                    if (len < minLen) {
                        minLen = len;
                        start = low;
                    }

                    char leftChar = s.charAt(low);

                    // Removing this character may invalidate the window
                    if (mapt.containsKey(leftChar)
                            && maps.get(leftChar).intValue()
                            == mapt.get(leftChar).intValue()) {
                        formed--;
                    }

                    maps.put(leftChar, maps.get(leftChar) - 1);
                    low++;
                }

                high++;
            }

            if (minLen == Integer.MAX_VALUE) {
                return "";
            }

            return s.substring(start, start + minLen);
        }
}
