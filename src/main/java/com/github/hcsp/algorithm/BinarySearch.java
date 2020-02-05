package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));

        String[] strings = new String[]{"aaa", "ccc", "fff", "ggg", "yyy", "zzz"};
        System.out.println(binarySearchByRecursion(strings, "yyy", 0, strings.length - 1));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (strings[mid].compareTo(target) < 0) {
                start = mid + 1;
            } else if (strings[mid].compareTo(target) > 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearchByRecursion(String[] strings, String target, int start, int end) {
        int mid = (end + start) / 2;
        if (strings[mid].compareTo(target) == 0) {
            return mid;
        } else if (strings[mid].compareTo(target) < 0) {
            return binarySearchByRecursion(strings, target, mid + 1, end);
        } else if (strings[mid].compareTo(target) > 0) {
            return binarySearchByRecursion(strings, target, start, mid - 1);
        }
        return -1;
    }
}
