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
        int start = 0;
        int end = strings.length - 1;
        if (strings[start].equals(target)) {
            return 0;
        }
        if (strings[end].equals(target)) {
            return end;
        }
        while (true) {
            int middle = (start + end) / 2;
            int res = target.compareTo(strings[middle]);
            if (res == 0) {
                return middle;
            } else if (res > 0) {
                start = middle;
            } else {
                end = middle;
            }
            if ((end - start) <= 1) {
                return -1;
            }
        }
    }
}
