package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式

    // 递归
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        return getIndex(strings, target, start, end);
    }

    private static int getIndex(String[] strings, String target, int start, int end) {
        int mid = (start + end) >> 1;
        if (end < start) {
            return -1;
        }
        if (target.equals(strings[mid])) {
            return mid;
        } else if (target.compareTo(strings[mid]) > 0) {
            return getIndex(strings, target, mid + 1, end);
        } else {
            return getIndex(strings, target, start, mid - 1);
        }

    }

    // 非递归
    public static int binarySearch2(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (target.equals(strings[start])) {
                return start;
            } else if (target.equals(strings[end])) {
                return end;
            }
            if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
                return -1;
            }
            if (target.compareTo(strings[mid]) > 0) {
                start = mid + 1;
            } else if (target.compareTo(strings[mid]) < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
