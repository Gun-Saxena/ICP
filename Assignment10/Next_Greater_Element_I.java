class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums2){
            while(!st.isEmpty() && i>st.peek()) {
                m.put(st.pop(),i);
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            m.put(st.pop(),-1);
        }
        int[] res=new int[nums1.length];
        for (int i=0; i<nums1.length;i++) {
            res[i]=m.get(nums1[i]);
        }
        return res;
    }
}