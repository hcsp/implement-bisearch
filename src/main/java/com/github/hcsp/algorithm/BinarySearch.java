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
        int head = 0;
        int tail = strings.length - 1;
        while (true) {
            int mid = (head + tail) / 2;
            if (strings[mid].equals(target)) {
                return mid;
            } else if (mid < (strings.length - 1) && strings[mid].compareTo(target) > 0) {
                tail = mid - 1;
            } else if (mid > 0 && strings[mid].compareTo(target) < 0) {
                head = mid + 1;
            } else {
                return -1;
            }
        }
    }
}
