class Solution {
      public int islandPerimeter(int[][] g) {
        int result=0,maxI=g.length-1,maxJ=g[0].length-1;
        for (int i=0;i<=maxI;i++)
            for (int j=0;j<=maxJ;j++)
                if (g[i][j]==1){
                    if (i==0   ||g[i-1][j]!=1) result+=2;
                    if (j==0   ||g[i][j-1]!=1) result+=2;
                }
        return result;
    }
}