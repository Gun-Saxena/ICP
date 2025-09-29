package ICP.Assignment3;

class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    clear(grid,i,j);
                }
            }
        }
        return c; 
    }
    void clear(char grid[][],int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
        for(int d[]:dir){
            clear(grid,r+d[0],c+d[1]);
        }
    }
}
