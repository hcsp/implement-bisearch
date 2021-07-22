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
        return binarySearch(strings, target, 0, strings.length - 1);
    }

    public static int binarySearch(String[] strings, String target, int low, int high) {
        if (strings[low].equals(target)) {
            return low;
        }

        if (strings[high].equals(target)) {
            return high;
        }

        int mid = (high + low) / 2;

        if (mid == low) {
            return -1;
        }

        if (strings[mid].compareTo(target) > 0) {
            return binarySearch(strings, target, low, mid);
        } else if (strings[mid].compareTo(target) < 0) {
            return binarySearch(strings, target, mid, high);
        } else {
            return mid;
        }
    }

}
