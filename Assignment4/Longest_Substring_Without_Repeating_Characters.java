package ICP.Assignment4;

// -- > Brute Force
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n=s.length();
//         int len=0;
//         for(int i=0;i<n;i++){
//             boolean[] vis=new boolean[256];
//             for(int j=i;j<n;j++){
//                 char ch=s.charAt(j);
//                 if(vis[ch]) break;
//                 vis[ch]=true;
//                 len=Math.max(len,j-i+1);
//             }
//         }
//         return len;
//     }
// }

// -- > Optimal
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int len=0;
        int j=0,i=0;
        Set<Character> set=new HashSet<>();
        while(i<n){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            else{
                set.add(s.charAt(i));
                len=Math.max(len,i-j+1);
                i++;
            }

        }
        return len;
    }
}