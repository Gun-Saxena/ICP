class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=']'){
                st.push(ch);
            }
            else{
                StringBuilder sb=new StringBuilder();
                while(st.peek()!='['){
                    sb.append(st.pop());
                }
                st.pop();
                int k=0,b=1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k=(st.pop()-'0')*b+k;
                    b*=10; 
                } 
                while(k-- > 0){
                    for(int i=sb.length()-1;i>=0; i--){
                        st.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] res=new char[st.size()];
        for(int i=st.size()-1;i>=0; i--){
            res[i] = st.pop();
        } 
        return new String(res);
    }
}