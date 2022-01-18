package com.github.hcsp.algorithm;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));

        System.out.println(binarySearchRecursion(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb", 0, 5));
        System.out.println(binarySearchRecursion(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy", 0, 5));

    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        int mid;


        while (start <= end) {
            mid = (start + end) / 2;
            if (strings[mid].compareTo(target) > 0) {
                end = mid - 1;
            } else if (strings[mid].compareTo(target) < 0) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

//    啰嗦易懂版
//public static int binarySearch(String[] strings, String target) {
//    int start = 0;
//    int end = strings.length - 1;
//    int mid;
//
//
//    while (true) {
//        if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
//            return -1;
//        }
//        if (strings[start] == target) {
//            return start;
//        }
//        if (strings[end] == target) {
//            return end;
//        }
//
//        mid = (start + end) / 2;
//        if (start == mid) {
//            return -1;
//        }
//        if (strings[mid] == target) {
//            return mid;
//        }
//
//        if (strings[mid].compareTo(target) > 0) {
//            end = mid;
//        } else {
//            start = mid;
//        }
//    }
//}


//    递归版

    public static int binarySearchRecursion(String[] strings, String target, int start, int end) {
        int mid = (start + end) / 2;
        if (strings[mid] == target) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (strings[mid].compareTo(target) < 0) {
            return binarySearchRecursion(strings, target, mid + 1, end);
        } else if (strings[mid].compareTo(target) > 0) {
            return binarySearchRecursion(strings, target, start, mid - 1);
        }
        return -1;
    }
}
