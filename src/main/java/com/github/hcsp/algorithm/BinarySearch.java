package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        while (start <= end) {
            if (strings[start].equals(target)) {
                return start;
            }
            if (strings[end].equals(target)) {
                return end;
            }
            if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
                return -1;
            }
            int mid = (start + end) / 2;
            //mid 大于target
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

    private static int binarySearchInterally(int low, int high, String target, String[] strings) {
        if (target.compareTo(strings[low]) < 0 || target.compareTo(strings[high]) > 0 || low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        String value = strings[mid];
        if (target.equals(value)) {
            return mid;
        } else if (value.compareTo(target) > 0) {
            high = mid - 1;
            return binarySearchInterally(low, high, target, strings);
        } else {
            low = mid + 1;
            return binarySearchInterally(low, high, target, strings);
        }
    }
}
