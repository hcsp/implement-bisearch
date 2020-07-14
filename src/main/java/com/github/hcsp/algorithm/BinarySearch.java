package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch1(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch1(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
//    非递归：
    public static int binarySearch1(String[] strings, String target) {
        int start = 0, end = strings.length - 1;
        while (true) {
            if (target.compareTo(strings[start]) == 0) {
                return start;
            }
            int mid = (start + end) / 2;
            if (target.compareTo(strings[mid]) > 0) {
                if (mid == end) {
                    return -1;
                }
                start = mid + 1;
            } else if (target.compareTo(strings[mid]) < 0) {
                if (mid < 1) {
                    return -1;
                }
                end = mid - 1;
            } else {
                return mid;
            }
        }
    }

    //  递归：
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        return search(strings, target, start, end);
    }

    static int search(String[] strings, String target, int start, int end) {
        if (target.compareTo(strings[start]) == 0) {
            return start;
        }
        int mid = (start + end) / 2;
        if (target.compareTo(strings[mid]) > 0) {
            if (mid == end) {
                return -1;
            }
            return search(strings, target, mid + 1, end);
        } else if (target.compareTo(strings[mid]) < 0) {
            if (mid < 1) {
                return -1;
            }
            return search(strings, target, start, mid - 1);
        } else {
            return mid;
        }
    }
}
