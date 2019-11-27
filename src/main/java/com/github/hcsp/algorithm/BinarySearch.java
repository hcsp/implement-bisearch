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
        int start = 0, end = strings.length - 1;
        while (start <= end) {
            int middle = (start + end) >>> 1;
            int flag = target.compareTo(strings[middle]);
            if (flag == 0) {
                return middle;
            } else if (flag > 0) { //
                start = middle + 1;
            } else if (flag < 0) {
                end = middle - 1;
            }
        }
        return -1;
    }
}
