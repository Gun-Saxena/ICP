class Solution {
    public String removeKdigits(String num, int k) {
        int l=num.length();
        if(k==0) return num;
        if(k==l) return "0";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<l;i++){
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k-- > 0){
            st.pop();
        }
        String s="";
        while(!st.isEmpty()){
            s=st.pop()+s;
        }
        while(s.length()>1 && s.charAt(0)=='0'){
            s=s.substring(1);
        }
        return s;
    }
}