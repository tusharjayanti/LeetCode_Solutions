//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int l = 0, r = nums.length - 1;
        result[0] = binarySearchLeft(nums, l, r, target);
        result[1] = binarySearchRight(nums, l, r, target);
        return result;
    }

    public static int binarySearchLeft(int[] nums, int l, int r, int target) {
        int firstPos = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                firstPos = mid;
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return firstPos;
    }

    public static int binarySearchRight(int[] nums, int l, int r, int target) {
        int lastPos = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                lastPos = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return lastPos;
    }
}
