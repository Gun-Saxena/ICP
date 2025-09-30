package ICP.Assignment4;

class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr=new int[26];
        int res= 0,max=0,len=0;
        for(int i=0;i<s.length();i++) {
            arr[s.charAt(i)-'A']++;
            max=Math.max(max,arr[s.charAt(i)-'A']);
            if (i-len+1-max>k) { 
                arr[s.charAt(len)-'A']--;
                len++;
            }
            res=Math.max(res,i-len+1);
        }
        return res;
    }
}

