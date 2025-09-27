//-- > brute force
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//          Arrays.sort(nums);
//          return nums[nums.length-k];

//     }
// }
// -- > optimal
import java.util.PriorityQueue;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mh=new PriorityQueue<>();
        for(int i:nums){
            mh.add(i);
            if(mh.size()>k) {
                mh.poll();
            }
        }
        return mh.peek();
    }
}