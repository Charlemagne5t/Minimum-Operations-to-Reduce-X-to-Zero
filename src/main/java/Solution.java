import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minOperations(int[] nums, int x) {
        Map<String, Integer> memo = new HashMap<>();
        int answer = dfs(nums, x, 0, nums.length - 1, memo);

        return answer > nums.length ? -1 : answer;
    }
    private int dfs(int[] nums, int x, int left, int right, Map<String, Integer> memo){
        if(x == 0){
            return 0;
        }
        if(memo.containsKey(x + " " + left + " " + right)){
            return memo.get(x + " " + left + " " + right);
        }
        if(x < 0 || left > nums.length - 1 || right < 0 || left > right){
            return Integer.MAX_VALUE / 2;
        }


        int takeLeft = 1 + dfs(nums, x - nums[left], left + 1, right, memo);
        int takeRight = 1 + dfs(nums, x - nums[right], left, right - 1, memo);

        int result = Math.min(takeLeft, takeRight);
        memo.put(x + " " + left + " " + right, result);
        return result;

    }
}
