package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
        System.out.println(binarySearch(new String[]{"a", "brown", "dog", "fox", "jumps", "lazy", "over", "quick", "the"}, "aaa"));

    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int startIndex = 0;
        int endIndex = strings.length - 1;
        while (startIndex <= endIndex) {
            if (strings[startIndex].equals(target)) {
                return startIndex;
            } else if (strings[endIndex].equals(target)) {
                return endIndex;
            } else {
                int midIndex = (startIndex + endIndex) / 2;
                if (strings[midIndex].equals(target)) {
                    return midIndex;
                } else if (strings[midIndex].compareTo(target) > 0) {
                    endIndex = midIndex - 1;
                } else if (strings[midIndex].compareTo((target)) < 0) {
                    startIndex = midIndex + 1;
                }
            }
        }
        return -1;
    }
}
