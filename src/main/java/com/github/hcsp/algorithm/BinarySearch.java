package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
        String[] strings = new String[]{"aaa", "ccc", "eee", "fff", "yyy", "zzz"};
        System.out.println(binarySearch2(strings, "bbb", 0, strings.length - 1));
        System.out.println(binarySearch2(strings, "yyy", 0, strings.length - 1));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int endIndex = strings.length - 1;
        int startIndex = 0;
        while (true) {
            if (target.equals(strings[startIndex])) {
                return startIndex;
            }
            if (target.equals(strings[endIndex])) {
                return endIndex;
            }
            if (target.compareTo(strings[startIndex]) < 0 || target.compareTo(strings[endIndex]) > 0) {
                return -1;
            }
            int mid = (startIndex + endIndex) / 2;
            if (target.compareTo(strings[mid]) > 0) {
                startIndex = mid + 1;
            } else if (target.compareTo(strings[mid]) < 0) {
                endIndex = mid - 1;
            } else {
                return mid;
            }
        }
    }

    public static int search(String[] strings, String target) {
        for (int i = 0; i < strings.length; i++) {
            if (target.equals(strings[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch2(String[] strings, String target, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
        }
        int midIndex = (startIndex + endIndex) / 2;
        if (target.compareTo(strings[midIndex]) > 0) {
            return binarySearch2(strings, target, midIndex + 1, endIndex);
        } else if (target.compareTo(strings[midIndex]) < 0) {
            return binarySearch2(strings, target, startIndex, endIndex - 1);
        } else {
            return midIndex;
        }
    }
}
