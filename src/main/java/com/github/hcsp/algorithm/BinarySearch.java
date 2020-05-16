package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式

    //非递归实现
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (strings[mid].compareTo(target) < 0) {
                start = mid + 1;
            } else {
                if (strings[mid].compareTo(target) == 0) {
                    return mid;
                }
                end = mid - 1;
            }
        }
        return -1;
    }

    //递归实现
    public static int binarySearch2(String[] strings, String target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (strings[mid].compareTo(target) < 0) {
                return binarySearch2(strings, target, mid + 1, end);
            } else if (strings[mid].compareTo(target) > 0) {
                return binarySearch2(strings, target, start, mid - 1);
            } else if (strings[mid].equals(target)) {
                return mid;
            }
        }
        return -1;
    }
}

