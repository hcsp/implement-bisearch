package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
        System.out.println(binarySearchByRecursive(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb", 0, 4));
        System.out.println(binarySearchByRecursive(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy", 0, 4));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int low = 0;
        int high = strings.length - 1;
        int middle;
        if (target.compareTo(strings[low]) < 0 || target.compareTo(strings[high]) > 0 || low > high) {
            return -1;
        }
        while (low <= high) {
            middle = (low + high) / 2;
            if (strings[middle].compareTo(target) > 0) {
                high = middle - 1;
            } else if (strings[middle].compareTo(target) < 0) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchByRecursive(String[] strings, String target, int low, int high) {
        if (target.compareTo(strings[low]) < 0 || target.compareTo(strings[high]) > 0 || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        if (strings[middle].compareTo(target) > 0) {
            return binarySearchByRecursive(strings, target, low, middle - 1);
        } else if (strings[middle].compareTo(target) < 0) {
            return binarySearchByRecursive(strings, target, middle + 1, high);
        } else {
            return middle;
        }
    }
}
