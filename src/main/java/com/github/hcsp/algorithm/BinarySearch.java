package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(
                binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    // 非递归
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        int middle = (start + end) / 2;
        while (true) {
            if (start > end) {
                return -1;
            }
            if (strings[middle].equals(target)) {
                break;
            } else {
                if (strings[middle].compareTo(target) > 0) {
                    end = middle - 1;
                } else if (strings[middle].compareTo(target) < 0) {
                    start = middle + 1;
                }
            }
            middle = (start + end) / 2;
        }
        return middle;
    }

    //递归
    public static int binarySearch(String[] strings, int start, int end, String target) {
        int middle = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (strings[middle].equals(target)) {
            return middle;
        } else {
            if (strings[middle].compareTo(target) > 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            return binarySearch(strings, start, end, target);
        }
    }
}
