package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
        System.out.println(binarySearchWithRecursive(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb", 0, 4));
        System.out.println(binarySearchWithRecursive(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy", 0, 4));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        int mid = (start + end) / 2;
        while (start < end) {
            if (target.equals(strings[start])) {
                return start;
            }
            if (target.equals(strings[end])) {
                return end;
            }
            if (target.equals(strings[mid])) {
                return mid;
            }
            if (target.compareTo(strings[mid]) > 0) {
                start = mid;
                end -= 1;
            } else {
                end = mid;
                start += 1;
            }
        }
        return -1;
    }

    //递归方法
    public static int binarySearchWithRecursive(String[] strings, String target, int start, int end) {
        int mid = (start + end) / 2;
        while (start <= end) {
            if (target.equals(strings[start])) {
                return start;
            }
            if (target.equals(strings[end])) {
                return end;
            }
            if (target.equals(strings[mid])) {
                return mid;
            }
            if (target.compareTo(strings[mid]) > 0) {
                return binarySearchWithRecursive(strings, target, mid, end - 1);
            } else {
                return binarySearchWithRecursive(strings, target, start + 1, mid);
            }
        }
        return -1;
    }
}

