class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder ans = new StringBuilder();
        StringBuilder original = new StringBuilder(s);

        int i = s.length()-1; 
        while(i>=0){
            ans.setLength(0);
            int loc = i;
            while(i>=0 && s.charAt(i)!='('){
                i--;
            }
            if (i < 0) {
                break;
            }
            loc = i;
            int point = i+1;
            while(point < s.length() && s.charAt(point)!=')'){
                ans.append(s.charAt(point));
                point++;
            }
            String reversed = new StringBuilder(ans).reverse().toString();
            original.replace(i,point+1,reversed);
            s = original.toString();
            i = Math.min(loc, s.length() - 1);
        }
        return s;
    }
}