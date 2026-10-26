class Solution {
    public int compress(char[] chars) {
        int i = 0 , j = 0, k = 0 ;
        while(j < chars.length && i < chars.length ){
            int count = 0 ;
            while(j < chars.length && chars[i]==chars[j] ){
                j++;
            }
            count = j-i;
            chars[k++] = chars[i];
            if(count > 1){
                for(char ch : Integer.toString(count).toCharArray()){
                    chars[k++] = ch;
                }
            }
            i = j;

        }
        return k;
    }
}