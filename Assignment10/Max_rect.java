class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans=0;
        for(int i=0;i<r;i++){  
            int h[]=new int[c];            
            for(int j=i;j<r;j++){
                for(int k=0;k<c;k++){
                    h[k]+=matrix[j][k]-'0';
                }
                int t=j-i+1;
                int s=0;
                for(int k=0;k<c;k++){
                    if(h[k]==t){
                        s+=t;
                        ans=Math.max(ans,s);
                    }
                    else s=0;
                }
            }
        }
        return ans;
    }
}