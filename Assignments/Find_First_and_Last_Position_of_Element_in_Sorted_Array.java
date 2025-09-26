class Solution {
    public int firstOccured(int[] nums,int target){
        int first=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }
    public int lastOccured(int[] nums,int target){
        int last=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                last=mid;
                start=mid+1;;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=firstOccured(nums,target);
        res[1]=lastOccured(nums,target);
        return res;
    }
}