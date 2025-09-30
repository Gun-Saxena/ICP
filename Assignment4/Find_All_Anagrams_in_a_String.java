package ICP.Assignment4;

import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] freq1=new int[26];
        for(int i=0;i<p.length();i++) {
            freq1[p.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        int freq2[]=new int[26];
        while(j<s.length()) {
            freq2[s.charAt(j)-'a']++;
            if((j-i+1)>p.length()) {
                freq2[s.charAt(i)-'a']--;
                i++;
            }
            if (frequency(freq1, freq2)) {
                list.add(i);
            }
            j++;
        }
        return list;
    }
    static boolean frequency(int[] freq1, int[] freq2) {
        for(int i=0;i<26;i++) {
            if(freq1[i]!=freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
