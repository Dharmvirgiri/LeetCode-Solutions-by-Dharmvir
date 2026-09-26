class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        int minLength = strs[0].length();
        StringBuilder ans = new StringBuilder("");
        for(String str : strs){
            if(str.length() < minLength){
                 minLength = str.length();
            }
        }
        for(int i = 0 ; i < minLength ; i++){
            for(int j = 0 ; j < strs.length-1; j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    return ans.toString();
                }
            }
           ans.append(strs[0].charAt(i));
                
        }
        return ans.toString();
    }
}