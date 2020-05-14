package com.github.hcsp.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] { "aaa", "ccc", "fff", "yyy", "zzz" }, "bbb"));
        System.out.println(binarySearch(new String[] { "aaa", "ccc", "fff", "yyy", "zzz" }, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearchXX(String[] strings, String target) {
        int minPoint = 0;
        int maxPoint = strings.length - 1;
        int midPoint = 0;
        while (minPoint <= maxPoint) {
            midPoint = (minPoint + maxPoint) / 2;
            if (target.compareTo(strings[midPoint]) == 0) {
                return midPoint;
            } else if (target.compareTo(strings[midPoint]) < 0) {
                maxPoint = midPoint - 1;
            } else {
                minPoint = midPoint + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] strings, String target) {
        return Arrays.binarySearch(strings, target) > 0 ? Arrays.binarySearch(strings, target) : -1;
    }
}
