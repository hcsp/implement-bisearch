package com.github.hcsp.algorithm;

import java.util.Arrays;

public class BinarySearch {

    private int startNum;

    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    public static int getCenterNum(int lowestIndex, int highestIndex) {
        return (int) Math.ceil(((double) lowestIndex + highestIndex) / 2);
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int lowestIndex = 0;
        int endNum = strings.length - 1;

        for (int i = 0; i <= strings.length - 1; i++) {
            int currIndex = getCenterNum(lowestIndex, endNum);
            int compareResult = strings[currIndex].compareTo(target);

            if (compareResult == 0) {
                return currIndex;
            } else if (compareResult < 0) {
                lowestIndex = currIndex;
            } else {
                endNum = currIndex;
            }
        }
        return -1;
    }
}
