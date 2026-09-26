class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char min = '{' ;
        for(int i = 0; i < letters.length ; i ++){
            if(target < letters[i] && min > letters[i]){
                min = letters[i];
            }
        }
        if(min=='{') return letters[0];
        return min;
    }
}