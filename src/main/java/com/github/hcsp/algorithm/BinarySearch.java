package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
/*
    public static int binarySearch(String[] strings, String target) {
        int lowIdx = 0;
        int highIdx = strings.length - 1;
        while (lowIdx <= highIdx) {
            int midIdx = (lowIdx + highIdx) / 2;
            int result = target.compareTo(strings[midIdx]);
            if (result > 0) {
                lowIdx = midIdx + 1;
            } else if (result < 0) {
                highIdx = midIdx - 1;
            } else {
                return midIdx;
            }
        }
        return -1;
    }
*/

    public static int binarySearch(String[] strings, String target) {
        return binarySearch(strings, target, 0, strings.length - 1);
    }

    public static int binarySearch(String[] strings, String target, int low, int hi) {
        if (low > hi) {
            return -1;
        }
        int mid = (low + hi) / 2;
        int result = target.compareTo(strings[mid]);
        if (result > 0) {
            return binarySearch(strings, target, mid + 1, hi);
        } else if (result < 0) {
            return binarySearch(strings, target, low, mid - 1);
        }

        return mid;
    }
}
