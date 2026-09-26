class Solution {
    public String largestNumber(int[] nums) {
        String[] ansarr = new String[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            ansarr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ansarr, (a, b) -> (b + a).compareTo(a + b));
        if(ansarr[0].equals("0")){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        for(String i : ansarr){
            ans.append(i);
        }
        return ans.toString();
    }
}