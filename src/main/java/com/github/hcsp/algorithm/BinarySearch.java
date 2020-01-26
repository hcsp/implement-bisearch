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
        int l = 0, r = strings.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;  // avoid overflow

            if (strings[mid].equals(target)) {
                return mid;
            } else if (target.compareTo(strings[mid]) < 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(String[] strings, String target, int l, int r) {
        if (l == r) {
            return target.equals(strings[l]) ? l : -1;
        }

        int mid = l + (r - l) / 2;

        if (strings[mid].equals(target)) {
            return mid;
        } else if (target.compareTo(strings[mid]) < 0) {
            return recursiveBinarySearch(strings, target, l, mid - 1);
        } else {
            return recursiveBinarySearch(strings, target, mid + 1, r);
        }

    }
}
