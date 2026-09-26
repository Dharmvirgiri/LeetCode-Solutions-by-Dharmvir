class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0, right = 0, count = 0;
        int minLength = Integer.MAX_VALUE;
        String ans = "";

        while (right < s.length()) {

            if (s.charAt(right) == '1') {
                count++;
            }
            right++;

            while (count >= k) {
                String current = s.substring(left, right);
                int currentLength = right - left;

                if (currentLength < minLength ||
                    (currentLength == minLength && current.compareTo(ans) < 0)) {
                    
                    minLength = currentLength;
                    ans = current;
                }

                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
        }

        return ans;
    }
}