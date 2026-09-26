class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxOverlap = 0 ;
        for(int rowOff = -n+1  ; rowOff < n ; rowOff++){
            for(int colOff = -n+1 ; colOff < n ; colOff++){
                int count = CountOverlap(img1,img2,rowOff,colOff);
                maxOverlap = Math.max(maxOverlap,count);
            }
        }
        return maxOverlap;
    }
    public int CountOverlap(int[][] a ,int[][] b,int rowOff,int colOff){
        int n = a.length;
        int count = 0 ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int b_i = i + rowOff;
                int b_j = j + colOff;
                if(b_i < 0 || b_i >= n || b_j < 0 || b_j >= n){
                    continue;
                }
                if(a[i][j]==1 && b[b_i][b_j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}