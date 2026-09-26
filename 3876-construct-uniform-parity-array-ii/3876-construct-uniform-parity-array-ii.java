class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0],minOdd = Integer.MAX_VALUE;
        
        for(int x:nums1){
            min = Math.min(min,x);
            if(x%2 != 0){
                minOdd = Math.min(minOdd,x);
            }
        }
        if(minOdd==Integer.MAX_VALUE){
            return true;
        }
        for(int x: nums1){
            if(x%2==0 && x < minOdd){
                return false;
            }
        }
        return true;
    }
}