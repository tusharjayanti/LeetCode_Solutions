//  Author: Tushar Jayanti
//  github: https://github.com/tusharjayanti
// LinkedIn: https://www.linkedin.com/in/tusharjayanti/

/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

*/
class Solution {

    public static boolean test0() {
        return (searchInsert(new int[]{1,3,5,6},5)==2);
    }

    public static boolean test1() {
        return (searchInsert(new int[]{1,3,5,6},2)==1);
    }

    public static boolean test2() {
        return (searchInsert(new int[]{1,3,5,6},7)==4);
    }

    public static boolean test3() {
        return (searchInsert(new int[]{1,3,5,7},6)==3);
    }

    // Linear(O(n)) solution does not meet target runtime of O(log(n))

    // public static int searchInsert(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == target)
    //             return i;
    //         else if (nums[i] > target)
    //             return i;
    //     }
    //     return nums.length;
    // }


    // O(log(n))
    public static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        int mid = 0;
        while(l <= r) {
            mid = l + (r-l)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid]>target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }


    public static void main(String[] args) {
        System.out.println(test0());
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
    }


}
