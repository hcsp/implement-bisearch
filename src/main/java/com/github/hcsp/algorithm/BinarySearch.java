package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));

        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb", 0, 4));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy", 0, 4));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式

    //普通实现
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        int middle;
        if (strings[start].compareTo(strings[end]) > 0) {
            return -1;
        }
        while (start <= end) {

            middle = (end - start) / 2 + start;
            if (strings[middle].compareTo(target) < 0) {
                start = middle + 1;
            } else if (strings[middle].compareTo(target) > 0) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


    //递归实现
    public static int binarySearch(String[] strings, String target, int start, int end) {
        int middle = (end - start) / 2 + start;

        if (strings[start].compareTo(strings[end]) > 0) {
            return -1;
        }
        if (strings[middle].compareTo(target) < 0) {
            return binarySearch(strings, target, middle + 1, end);
        } else if (strings[middle].compareTo(target) > 0) {
            return binarySearch(strings, target, start, end - 1);
        } else {
            return middle;
        }
    }
}
