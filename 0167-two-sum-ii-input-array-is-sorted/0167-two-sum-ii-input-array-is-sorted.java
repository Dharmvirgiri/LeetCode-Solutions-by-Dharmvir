class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0 ; 
        int high = numbers.length - 1 ;
        while(low < high){
            int sum = numbers[high]+numbers[low] ;
            if(sum == target){
                break;
            }
            if(sum<target){
                low++;
            }
            if(sum>target){
                high--;
            }
        }
        return new int[] {low+1,high+1};
    }
}