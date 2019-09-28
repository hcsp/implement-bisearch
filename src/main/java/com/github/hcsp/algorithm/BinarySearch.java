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

    //  Method_1 : 非递归二分查找
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (strings[middle].equals(target)) {
                return middle;
            } else if (target.compareTo(strings[middle]) < 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    // Method_2 : 递归二分查找
    public static int binarySearchWithRecursive(String[] strings, String target, int start, int end) {
        int middle = (start + end) / 2;
        while (start <= end) {
            if (target.equals(strings[middle])) {
                return middle;
            } else if (target.compareTo(strings[middle]) < 0) {
                return binarySearchWithRecursive(strings, target, start, middle - 1);
            } else {
                return binarySearchWithRecursive(strings, target, middle + 1, end);
            }
        }
        return -1;
    }
}
