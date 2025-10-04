package ICP.Assignment6;

class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(check(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean check(char b[][],String w,int in,int i,int j){
        if(in==w.length()) return true;
        if(i<0 || i>=b.length || j<0 || j>=b[0].length || b[i][j]!=w.charAt(in)) return false;
        char ch=b[i][j];
        b[i][j]='$';
        boolean found=false;
        found|=check(b,w,in+1,i+1,j);
        found|=check(b,w,in+1,i-1,j);
        found|=check(b,w,in+1,i,j+1);
        found|=check(b,w,in+1,i,j-1);
        b[i][j]=ch;
        return found;
    }
}