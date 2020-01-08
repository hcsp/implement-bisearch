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
        if (strings == null || strings.length == 0) {
            return -1;
        }
        int L = 0;
        int R = strings.length - 1;
        int mid = 0;
        while (L <= R) {
            mid = (L + R) >> 1;
            if (strings[mid].equals(target)) {
                return mid;
            } else if (strings[mid].compareTo(target) > 0) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return -1;
//        return binarySearch(strings, target, 0, strings.length);
    }

    public static int binarySearch(String[] strings, String target, int L, int R) {
        if (L >= R || strings == null || strings.length == 0) {
            return -1;
        }
        int mid = (L + R) >> 1;
        if (strings[mid].equals(target)) {
            return mid;
        } else if (strings[mid].compareTo(target) > 0) {
            return binarySearch(strings, target, L, mid - 1);
        } else {
            return binarySearch(strings, target, mid + 1, R);
        }
    }

    public static int binarySearch2(String[] strings, String target, int L, int R) {
        if (L >= R || strings == null || strings.length == 0) {
            return -1;
        }
        int mid = L + ((R - L) >> 1);
        return strings[mid].equals(target) ? mid : strings[mid].compareTo(target) > 0 ? binarySearch2(strings, target, L, mid - 1) : binarySearch2(strings, target, mid + 1, R);
    }
}
