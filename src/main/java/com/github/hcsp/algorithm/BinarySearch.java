package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int result(String[] strings, String target, int start, int end) {
        while (start < end) {
            if (strings[start].equals(target)) {
                return start;
            } else if (strings[end].equals(target)) {
                return end;
            }
            int mid = (end - start) / 2;

            if (strings[mid].equals(target)) {
                return mid;
            } else if (strings[mid].compareTo(target) < 0) {
                return result(strings, target, mid + 1, end);
            } else if (strings[mid].compareTo(target) > 0) {
                return result(strings, target, start, mid - 1);
            }
        }
        return -1;
    }

    public static int binarySearch(String[] strings, String target) {
        //非递归
        return result(strings, target, 0, strings.length - 1);
    }
}
