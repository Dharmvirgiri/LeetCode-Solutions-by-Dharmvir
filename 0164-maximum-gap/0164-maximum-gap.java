class Solution {
    public int maximumGap(int[] nums) {

        int n = nums.length;

        if (n < 2) {
            return 0;
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) {
            return 0;
        }

        long range = (long) max - min;
        long gap = (range + n - 2) / (n - 1);

        int[] bucketMin = new int[n];
        int[] bucketMax = new int[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }

        for (int num : nums) {

            int index = (int) (((long) num - min) / gap);

            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);

            used[index] = true;
        }

        int answer = 0;
        int previousMax = min;

        for (int i = 0; i < n; i++) {

            if (!used[i]) {
                continue;
            }

            int currentGap = bucketMin[i] - previousMax;

            answer = Math.max(answer, currentGap);

            previousMax = bucketMax[i];
        }

        return answer;
    }
}