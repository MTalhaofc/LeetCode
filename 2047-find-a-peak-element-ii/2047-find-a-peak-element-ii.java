class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int[] result = {1};
        for(int i = 0; i<mat.length; i++){
            for(int j= 0; j< mat[i].length; j++){
                if(max < mat[i][j]){
                    max = mat[i][j];
                  result =  new int[]{i,j};
                }
        }}
                    return result;
    }
}