
import java.util.*;

class Solution {
    public long countIntersectingIntervals(int[][] intervals) {

        int[][] temoravlin = intervals;

        Arrays.sort(temoravlin, (a, b) -> 
            Integer.compare(a[0], b[0])
        );

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long count = 0;

        for (int i = 0; i < temoravlin.length; i++) {

            int start = temoravlin[i][0];
            int end = temoravlin[i][1];

            // Remove intervals that ended before current start
            while (!minHeap.isEmpty() &&
                   minHeap.peek() < start) {

                minHeap.poll();
            }

            // All remaining intervals intersect current interval
            count += minHeap.size();

            // Add current interval's end
            minHeap.offer(end);
        }

        return count;
    }
}