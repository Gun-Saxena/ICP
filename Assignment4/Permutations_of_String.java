package ICP.Assignment4;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2=s2.length();
        if(len1>len2) return false;
        char[] cnt1 = new char[26];
        for( char c:s1.toCharArray()){
            cnt1[c-'a']++;
        }
        for(int i=0;i<=len2-len1;i++){
            String sb=s2.substring(i,i+len1);
            char[] cnt2 = new char[26];
            for(char c:sb.toCharArray()){
                cnt2[c-'a']++;
            }
            boolean flag=true;
            for(int k=0;k<26;k++){
                if(cnt1[k]!=cnt2[k]){
                    flag=false;
                }
            }
            if(flag) return true;
        }
        return false;
    }
}

