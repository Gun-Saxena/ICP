import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int arrow=1;
        int start=points[0][0];
        int end=points[0][1];
        for(int i=0;i<points.length;i++){
            int curr_start=points[i][0];
            int curr_end=points[i][1];
            if(curr_start>end){
                arrow++;
                start=curr_start;
                end=curr_end;
            }
            else{
                start=Math.max(start,curr_start);
                end=Math.min(end,curr_end);
            }
        }
        return arrow;
    }
}