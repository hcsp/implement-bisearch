package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        String[] strings = new String[]{"aaa", "ccc", "fff", "yyy", "zzz"};
        System.out.println(binarySearch(strings, "bbb"));
        System.out.println(binarySearch(strings, "yyy"));
        System.out.println(binarySearch2(strings, "aaa", 0, strings.length - 1));
        System.out.println(binarySearch2(strings, "zzz", 0, strings.length - 1));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int head = 0;
        int tail = strings.length - 1;
        while (tail >= head) {
            int mid = head + (tail - head) / 2;
            String val = strings[mid];
            if (val.equals(target)) {
                return mid;
            } else if (val.charAt(0) > target.charAt(0)) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(String[] strings, String target, int start, int end) {
        if (end < start) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (strings[mid].charAt(0) > target.charAt(0)) {
            return binarySearch2(strings, target, start, mid - 1);
        } else if (strings[mid].charAt(0) < target.charAt(0)) {
            return binarySearch2(strings, target, mid + 1, end);
        } else {
            return mid;
        }
    }
}
