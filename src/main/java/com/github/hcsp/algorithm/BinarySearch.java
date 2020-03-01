package com.github.hcsp.algorithm;

public class BinarySearch {
    private static int start;
    private static int end;
    private static String[] strings;
    private static String target;

    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        BinarySearch.start = 0;
        BinarySearch.end = strings.length - 1;
        BinarySearch.strings = strings;
        BinarySearch.target = target;
//        return notRecursiveBinarySearch(); // 非递归
        return recursiveBinarySearch(BinarySearch.start, BinarySearch.end); // 递归
    }

    public static int notRecursiveBinarySearch () {
        while (true) {
            if (strings[start].equals(target)) {
                return start;
            }
            if (strings[end].equals(target)) {
                return end;
            }
            boolean isIllegal = target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0;
            if (isIllegal) {
                return -1;
            }
            int middle = (start + end) / 2;
            if (target.compareTo(strings[middle]) > 0) {
                start = middle + 1;
            } else if (target.compareTo(strings[middle]) < 0) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
    }

    public static int recursiveBinarySearch (int start, int end) {
        if (strings[start].equals(target)) {
            return start;
        }
        if (strings[end].equals(target)) {
            return end;
        }
        boolean isIllegal = target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0;
        if (isIllegal) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (target.compareTo(strings[middle]) > 0) {
            return recursiveBinarySearch(middle + 1, end);
        } else if (target.compareTo(strings[middle]) < 0) {
            return recursiveBinarySearch(start, middle - 1);
        } else {
            return middle;
        }
    }
}
