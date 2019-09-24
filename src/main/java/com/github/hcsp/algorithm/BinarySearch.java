package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
        System.out.println(binarySearchWithRecursive(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb", 0, 5));
        System.out.println(binarySearchWithRecursive(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy", 0, 5));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int low = 0;
        int high = strings.length - 1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (strings[middle].equals(target)) {
                return middle;
            } else if (target.compareTo(strings[middle]) < 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static int binarySearchWithRecursive(String[] strings, String target, int low, int high) {
        int middle = (low + (high - 1)) / 2;
        if (low >= high) {
            return -1;
        }
        if (target.equals(strings[middle])) {
            return middle;
        } else if (target.compareTo(strings[middle]) < 0) {
            return binarySearchWithRecursive(strings, target, low, middle - 1);
        } else {
            return binarySearchWithRecursive(strings, target, middle + 1, high);
        }
    }
}
