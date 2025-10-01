package ICP.Assignment4;

import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int lenS = s.length();
        int lenP = p.length();
        if(lenS < lenP) return result;
        int[] countP = new int[26];
        for(char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        for(int i = 0; i <= lenS - lenP; i++) {
            String sub = s.substring(i, i + lenP);
            int[] countSub = new int[26];
            for(char c : sub.toCharArray()) {
                countSub[c - 'a']++;
            }

            boolean match = true;
            for(int j = 0; j < 26; j++) {
                if(countP[j] != countSub[j]) {
                    match = false;
                    break;
                }
            }

            if(match) result.add(i);
        }

        return result;
    }
}
