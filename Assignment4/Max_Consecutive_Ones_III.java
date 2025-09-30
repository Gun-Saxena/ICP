package ICP.Assignment4;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=0;
        int i=0;
        int j=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==0){
                z++;
            }
            while(z>k){
                if(nums[i]==0){
                    z--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
