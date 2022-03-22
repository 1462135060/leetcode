package com.cii.leetcode.simple;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class code_53 {

    /**
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     * 子数组 是数组中的一个连续部分。
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = nums[0];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max >= 0) {
                max += nums[i];
            } else {
                max = nums[i];
            }
            if (max > res) {
                res = max;
            }
        }
        return res;
    }


    /**
     * 示例 1：
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组[4,-1,2,1] 的和最大，为6 。
     *
     * 示例 2：
     * 输入：nums = [1]
     * 输出：1
     *
     * 示例 3：
     * 输入：nums = [5,4,-1,7,8]
     * 输出：23
     */
    @Test
    void test() {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
