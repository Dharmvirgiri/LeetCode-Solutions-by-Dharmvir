class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0 , left = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(ch);
            count = Math.max(i-left+1,count);
        }
        return count;
    }
}