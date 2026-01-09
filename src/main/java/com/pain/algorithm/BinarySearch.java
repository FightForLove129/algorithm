package com.pain.algorithm;

/**
 * 二分查找
 * 问题1：为什么是 left <= right，而不是 left < right?
 *  没有考虑 i=j的时候，target 刚好满足的情况。
 * 问题2：mid = left + (right - left) / 2，有问题吗？
 *   如果 right = Integer.MAX_VALUE，那么 mid = left + (right - left) / 2 可能会出现溢出的问题。
 *   解决方案，mid = left + (right - left) / 2 >>> 1，直接右移一位，相当于除以2（取整）
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
