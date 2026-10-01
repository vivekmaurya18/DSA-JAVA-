import java.util.*;
class mergeIntervals {
    public static  int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>ans=new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (ans.isEmpty() ||
                intervals[i][0] > ans.get(ans.size() - 1)[1]) {

                ans.add(intervals[i]);
            } else {

                ans.get(ans.size() - 1)[1] =
                    Math.max(ans.get(ans.size() - 1)[1],
                             intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        int[][] result = merge(intervals);

        System.out.println(Arrays.deepToString(result));
    }
}