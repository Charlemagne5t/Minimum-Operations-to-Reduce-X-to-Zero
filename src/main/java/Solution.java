import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;

        for (int num :nums) {
            sum += num;
        }
        if(sum < x){
            return  -1;
        }
        if(sum == x){
            return nums.length;
        }
        int maxSubArraySum = sum - x;
        int left = 0;
        int right = 0;
        int currentSum = nums[0];
        int maxLength = -1;

        while (right != nums.length -1){
            if(currentSum == maxSubArraySum){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            if(currentSum > maxSubArraySum && left == right){
                currentSum -= nums[left];
                left++;
                right++;
                if(right < nums.length){
                    currentSum += nums[right];
                }else break;
            }
            if(currentSum <= maxSubArraySum){
                right++;
                currentSum += nums[right];
            }else if(left < right){
                currentSum -= nums[left];
                left++;

            }
            if(right == nums.length - 1 && currentSum > maxSubArraySum){
                while (currentSum > maxSubArraySum && left <= right){
                    currentSum -= nums[left];
                    left++;
                }
            }
            if(currentSum == maxSubArraySum){
                maxLength = Math.max(maxLength, right - left + 1);
            }

        }
        return maxLength == -1 ? -1 : nums.length - maxLength;

    }
}