class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int index = 0 , i = 0 ;
        while(i < s.length() && index < spaces.length){
            if(i == spaces[index]){
                str.append(" ");
                index++;
            }
            str.append(s.charAt(i++));
        }
        while(i<s.length()){
            str.append(s.charAt(i++));
        }
        return str.toString();
    }
}