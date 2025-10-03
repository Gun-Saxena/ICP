package ICP.Assignment5;

import java.util.Arrays;
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int c=1;
        int end=points[0][1];
        int i=1;
        while(i<points.length){
            if(points[i][0]>end){
                c++;
                end=points[i][1];
            }
            i++;
        }
        return c;
    }
}