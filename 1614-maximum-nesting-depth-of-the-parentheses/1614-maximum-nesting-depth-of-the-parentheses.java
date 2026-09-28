class Solution {
    public int maxDepth(String s) {
        int ans = 0 , count = 0 ;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i)==')'){
                count++;
                ans = Math.max(ans,count);
            }
            if(s.charAt(i)=='('){
                count--;
            }
        }
        return ans;
    }
}