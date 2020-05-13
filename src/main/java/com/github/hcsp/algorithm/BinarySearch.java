package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] { "aaa", "ccc", "fff", "yyy", "zzz" }, "bbb"));
        System.out.println(binarySearch(new String[] { "aaa", "ccc", "fff", "yyy", "zzz" }, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearchxx(String[] strings, String target) {
        int minPoint = 0;
        int maxPoint = strings.length - 1;
        int midPoint = 0;
        while (minPoint <= maxPoint) {
            midPoint = (minPoint + maxPoint) / 2;
            if (target.compareTo(strings[midPoint]) == 0) {
                return midPoint;
            } else if (target.compareTo(strings[midPoint]) < 0) {
                maxPoint = midPoint - 1;
            } else {
                minPoint = midPoint + 1;
            }
        }
        return -1;
    }

    static int minPoint = 0;
    static int maxPoint = Integer.MAX_VALUE;

    public static int binarySearch(String[] strings, String target) {
        if (minPoint > maxPoint) {
            return -1;
        }
        if (maxPoint > strings.length) {
            maxPoint = strings.length - 1;
        }
        int midPoint = (minPoint + maxPoint) / 2;
        if (target.compareTo(strings[midPoint]) == 0) {
            return midPoint;
        } else if (target.compareTo(strings[midPoint]) < 0) {
            maxPoint = midPoint - 1;
            return binarySearch(strings, target);
        } else {
            minPoint = midPoint + 1;
            return binarySearch(strings, target);
        }
    }
}
