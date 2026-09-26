class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder ans = new StringBuilder();
        while(num!=0){
            int digit = num % 7;
            ans.append(digit);
            num/=7;
        }
        if (negative) {
            ans.append('-');
        }
        return ans.reverse().toString();
    }
}