class Solution {
    int[][] grid;
    boolean[][] visited;
    private int dfs(int r,int c){
        // Base case
        if(r<0 || r>=grid.length ||c<0 || c>=grid[0].length ||grid[r][c]==0||visited[r][c]==true){
            return 0;
        }
        else{
            visited[r][c] = true;
            return 1+dfs(r-1,c)+dfs(r+1,c)+dfs(r,c-1)+dfs(r,c+1);
        }

    }
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];
       
        int ans = 0;
        int max_area = 0 ;
        int curr_area ;
        for(int r = 0 ; r< m ; r++){
            for(int c = 0 ; c<n ; c++){
                curr_area=dfs(r,c);
                max_area = Math.max(curr_area,max_area);
            }
        }
        return max_area;
    
        


        
        
    }
}