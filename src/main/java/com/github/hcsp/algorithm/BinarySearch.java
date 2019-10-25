package com.github.hcsp.algorithm;

import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length;
        if ((new Random().nextInt() & 1) == 1) {
            return ordinaryBinarySearch(strings, target);
        }
        return recursionBinarySearch(start, end, strings, target);
    }

    public static int ordinaryBinarySearch(String[] strings, String target) {
        int index = -1;
        int start = 0;
        int end = strings.length;
        if ((target.compareTo(strings[start]) < 0)
                || (target.compareTo(strings[end - 1]) > 0)) {
            return index;
        }
        if (target.equals(strings[start])) {
            return start;
        }
        if (target.equals(strings[end - 1])) {
            return end - 1;
        }
        while (start != end - 1) {
            int middle = (start + end) >> 1;

            if (target.equals(strings[middle])) {
                return middle;
            }
            if (target.compareTo(strings[middle]) < 0) {
                end = middle;
            }
            if (target.compareTo(strings[middle]) > 0) {
                start = middle;
            }
        }
        return index;
    }

    private static int recursionBinarySearch(int start, int end, String[] strings, String target) {
        int middle = (start + end) >> 1;
        if (target.equals(strings[middle])) {
            return middle;
        }
        if (end - start == 1) {
            return -1;
        }
        if (target.compareTo(strings[middle]) < 0) {
            return recursionBinarySearch(start, middle, strings, target);
        } else {
            return recursionBinarySearch(middle, end, strings, target);
        }
    }
}
