import java.util.*;

public class CirArr {
    public static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[(int) stack.peek()] <= nums[i %
                    nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = (stack.isEmpty() ? -1 : nums[(int) stack.peek()]);
            stack.push(i % nums.length);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr = nextGreaterElements(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}