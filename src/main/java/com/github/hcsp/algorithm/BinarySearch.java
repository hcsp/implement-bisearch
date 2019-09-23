package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        // 递归实现二分查找
        int low = 0;
        int high = strings.length - 1;

        return recursionSearch(strings, low, high, target);
    }

    private static int recursionSearch(String[] strings, int low, int high, String target) {
        if (low <= high) {
            int middle = (low + high) / 2;
            String middleString = strings[middle];
            if (target.equals(middleString)) {
                return middle;
            } else if (target.compareTo(middleString) < 0) {
                // 目标在中间串前面
                return recursionSearch(strings, low, middle - 1, target);
            } else {
                // 目标在中间串后面
                return recursionSearch(strings, middle + 1, high, target);
            }
        } else {
            return -1;
        }
    }
}
