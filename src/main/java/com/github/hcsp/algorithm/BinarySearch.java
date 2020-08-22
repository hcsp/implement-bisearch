package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    /*public static int binarySearch(String[] strings, String target) {

        int l = 0;
        int r = strings.length - 1;
        int mid = 0;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (strings[mid].compareTo(target) == 0) {
                return mid;
            } else if (strings[mid].compareTo(target) > 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return strings[l] == target ? l : -1;
    }*/

    // recursion
    public static int binarySearch(String[] strings, String target) {
        return searchProcess(strings, target, 0, strings.length - 1);

    }

    private static int searchProcess(String[] strings, String target, int start, int end) {
        if (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (strings[mid].compareTo(target) == 0) {
                return mid;
            } else if (strings[mid].compareTo(target) > 0) {
                return searchProcess(strings, target, start, mid - 1);
            } else {
                return searchProcess(strings, target, mid + 1, end);
            }
        } else {
            return -1;
        }
    }
}
