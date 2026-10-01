class Solution {
    static void dfs(char[][] grid, int r , int c){
        grid[r][c]='0';
        if(r-1 >= 0 &&  grid[r-1][c]=='1'){
            dfs(grid,r-1,c);
        }
        if(r+1 < grid.length &&  grid[r+1][c]=='1'){
            dfs(grid,r+1,c);
        }
        if(c-1 >= 0 &&  grid[r][c-1]=='1'){
            dfs(grid,r,c-1);
        }
        if(c+1 < grid[0].length &&  grid[r][c+1]=='1'){
            dfs(grid,r,c+1);
        }

        
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(m == 0 ) return 0;
        int count = 0 ;
        for(int r = 0 ; r<m ; r++){
            for(int c = 0 ; c<n ; c++){
                if(grid[r][c]=='1'){
                    dfs(grid,r,c);
                    count++;
                }
            }

        }
        return count;

        
    }
}