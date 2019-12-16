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
//        1. 非递归写法
//        int start = 0, end = strings.length - 1;
//        int mid = (start + end) / 2;
//
//        while (mid > start) {
//            String startEl = strings[start], endEl = strings[end], midEl = strings[mid];
//            if (startEl.equals(target)) {
//                return start;
//            }
//            if (endEl.equals(target)) {
//                return end;
//            }
//            if (midEl.equals(target)) {
//                return mid;
//            }
//            if (target.compareTo(midEl) > 0) {
//                start = mid;
//                mid = (start + end) / 2;
//            } else if (target.compareTo(midEl) < 0) {
//                end = mid;
//                mid = (start + end) / 2;
//            }
//        }
//        return -1;

// 2. 递归写法
        return binarySearchRecursion(strings, target, 0, strings.length - 1);
    }

    private static int binarySearchRecursion(String[] strings, String target, int start, int end) {
        int mid = (start + end) / 2;
        if (mid <= start) {
            return -1;
        }
        String startEl = strings[start], endEl = strings[end], midEl = strings[mid];
        if (startEl.equals(target)) {
            return start;
        }
        if (endEl.equals(target)) {
            return end;
        }
        if (midEl.equals(target)) {
            return mid;
        }
        if (target.compareTo(midEl) > 0) {
            return binarySearchRecursion(strings, target, mid, end);
        }
        if (target.compareTo(midEl) < 0) {
            return binarySearchRecursion(strings, target, start, mid);
        }
        return -1;
    }
}
