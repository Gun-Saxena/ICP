class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<=i+k-1;j++){
                max=Math.max(max,nums[j]);
            }
            arr[i]=max;
        }
        return arr;
    }
}