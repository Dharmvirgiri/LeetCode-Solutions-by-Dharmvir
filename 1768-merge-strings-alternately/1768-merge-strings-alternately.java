class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder merged = new StringBuilder("");
        while(i != word1.length() && i != word2.length()){
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }
        while(i<word1.length()){
            merged.append(word1.charAt(i++));
        }
        while(i<word2.length()){
            merged.append(word2.charAt(i++));
        }
        return merged.toString();
    }
}