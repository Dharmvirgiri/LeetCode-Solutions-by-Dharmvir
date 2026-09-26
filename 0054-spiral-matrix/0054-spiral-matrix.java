class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sRow = 0 , eRow = matrix.length-1, sCol = 0 , eCol = matrix[0].length-1;
        while(sRow<=eRow && sCol<=eCol){
            //top
            for(int j = sCol ; j <= eCol ; j++){
                ans.add(matrix[sRow][j]);
            }
            //right
            for(int i = sRow+1 ; i <= eRow ; i++){
                ans.add(matrix[i][eCol]);
            }
            //bottom
            for(int j = eCol-1 ; j >= sCol ; j--){
                if(sRow==eRow){
                    break;
                }
                ans.add(matrix[eRow][j]);
            }
            //left
            for(int i = eRow-1 ; i >= sRow+1 ; i--){
                if(sCol==eCol){
                    break;
                }
                ans.add(matrix[i][sCol]);
            }
            sRow++;
            eRow--;
            sCol++;
            eCol--;
        }
        return ans;
    }
}