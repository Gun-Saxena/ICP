package ICP.Assignment5;

import java.util.*;
class Solution {
    public int[][] reconstructQueue(int[][] people) {
       Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> q=new ArrayList<>();
        for(int ele[]:people) {
            q.add(ele[1],ele);
        }
        return q.toArray(new int[people.length][]);
    }
}
