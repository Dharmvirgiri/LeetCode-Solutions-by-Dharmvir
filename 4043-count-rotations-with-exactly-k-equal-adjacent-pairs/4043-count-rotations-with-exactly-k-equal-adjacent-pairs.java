class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int t = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                t++;
            }
        }

        if (k == t - 1) {
            return t;
        } else if (k == t) {
            return n - t;
        } else {
            return 0;
        }
    }
}