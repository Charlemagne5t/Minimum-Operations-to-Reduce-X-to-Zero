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

    @Test
    public void minOperationsTest3(){
        int[] nums = {3,2,20,1,1,3};
        int x = 10;
        int expected = 5;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest4(){
        int[] nums = {5,2,3,1,1};
        int x = 5;
        int expected = 1;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest5(){
        int[] nums = { 8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        int x = 134365;
        int expected = 16;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minOperationsTest6(){
        int[] nums = {500,1,4,2,3};
        int x = 500;
        int expected = 1;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest7(){
        int[] nums = {5,1,4,2,3};
        int x = 6;
        int expected = 2;
        int actual = new Solution().minOperations(nums, x);

        Assert.assertEquals(expected, actual);
    }
}
