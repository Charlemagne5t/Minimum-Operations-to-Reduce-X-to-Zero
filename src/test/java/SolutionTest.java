import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minOperationsTest1(){
        int[] nums = {1,1,4,2,3};
        int x = 5;
        int expected = 2;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest2(){
        int[] nums = {5,6,7,8,9};
        int x = 4;
        int expected = -1;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }
}
