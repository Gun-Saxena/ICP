class Solution {
    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> st = new Stack<>();
        for(int ele:asteroids){
            boolean flag=false;
            while(!st.isEmpty() && ele<0 && st.peek()>0){
                if(Math.abs(ele)>st.peek()){
                    st.pop(); 
                }
                else if(Math.abs(ele)==st.peek()){
                    st.pop(); 
                    flag=true;
                    break;
                }
                else{
                    flag=true; 
                    break;
                }
            }
            if(!flag) {
                st.push(ele);
            }
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}