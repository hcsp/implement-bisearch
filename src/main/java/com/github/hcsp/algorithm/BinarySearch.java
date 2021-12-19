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
        int startInt = 0;
        int endInt = strings.length - 1;

        while (true) {
            String start = strings[startInt];
            String end = strings[endInt];
            int length = endInt - startInt + 1;

            if (target.compareTo(end) > 0 || target.compareTo(start) < 0) {
                return -1;
            }
            if (target.compareTo(end) == 0) {
                return endInt;
            }
            if (target.compareTo(start) == 0) {
                return startInt;
            }
            int midInt = length / 2;
            String mid = strings[midInt];
            if (target.compareTo(mid) > 0) {
                startInt = midInt + 1;
            } else if (target.compareTo(mid) < 0) {
                endInt = midInt - 1;
            } else {
                return midInt;
            }
        }
    }
}
