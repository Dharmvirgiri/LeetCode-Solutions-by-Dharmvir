class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int t = 0 ; 
        for(int i = 1 ; i <= n ; i ++){
           
           if(t==target.length){
            break;
           }

           ans.add("Push");

           if(i==target[t]){
            t++;
           }else{
            ans.add("Pop");
           }
        }
        return ans; 
    }
}