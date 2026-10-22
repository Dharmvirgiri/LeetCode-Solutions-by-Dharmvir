class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 , j = 0 ;
        int ans[] = new int[m+n] ;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[i+j] = nums1[i++];
            }else{
                ans[i+j] = nums2[j++];
            }
        }
        while(j<n){
            ans[i+j] = nums2[j++];
        }
        while(i<m){
                ans[j+i] = nums1[i++];
            }
        for(int k = 0 ; k < m+n ; k++){
            nums1[k] = ans[k];
        }
    }
}