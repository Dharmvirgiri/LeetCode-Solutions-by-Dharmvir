class Solution {
    public int countGoodRotations(int[] nums) {
        int count =  0 , n = nums.length , half = n/2;
        long suml = 0 , sumr = 0; 
        for(int i = 0 ; i < half ; i++){
            suml += nums[i];
            sumr += nums[i + half];
        }
        if(suml>sumr){
                count++;
            }
        for(int j = 0 ; j < n-1 ; j++){
            int midVal = nums[(j + half) % n];
            int rightVal = nums[(j + 2 * half) % n];
            int leftVal = nums[j];

            suml += midVal - leftVal;
            sumr += rightVal - midVal;
            if(suml>sumr){
                count++;
            }
        }
        return count;
    }
}