class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int l=0;
        char c='+';
        s=s.trim();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                l=l*10+(ch-'0');
            }
            if((!Character.isDigit(ch) && ch!=' ')||i==s.length()-1) {
                if(c=='+') {
                    st.push(l);
                }
                else if(c=='-') {
                    st.push(-l);
                }
                else if(c=='*') {
                    st.push(st.pop()*l);
                }
                else if(c=='/') {
                    st.push(st.pop()/l);
                }
                c=ch;
                l=0;
            }
        }
        int res=0;
        while(!st.isEmpty()) {
            res+=st.pop();
        }
        return res;
    }
}