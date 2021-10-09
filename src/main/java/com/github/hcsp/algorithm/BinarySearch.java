package com.github.hcsp.algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "zzz"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        if (strings[0].equals(target)) {
            return 0;
        } else if (strings[strings.length-1].equals(target)) {
            return strings.length-1;
        } else if (strings.length <= 2) {
            return -1;
        } else {
            int mid = strings.length/2;
            if (strings[mid].equals(target)) {
                return mid;
            } else if (strings[mid].compareTo(target) < 0) {
                return mid + 1 + binarySearch(Arrays.copyOfRange(strings, mid+1, strings.length), target);
            } else if (strings[mid].compareTo(target) > 0) {
                return binarySearch(Arrays.copyOfRange(strings, 0, mid), target);
            }
        }
        return -1;
    }
}
