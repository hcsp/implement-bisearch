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
        int head = 0, tail = strings.length - 1;
        while (true) {
            int mid = (head + tail) / 2;

            if (target.equals(strings[head])) {
                return head;
            }
            if (target.equals(strings[tail])) {
                return tail;
            }
            if (target.equals(strings[mid])) {
                return mid;
            }
            if (head >= mid || tail <= mid) {
                return -1;
            }
            if (target.compareTo(strings[mid]) < 0) {
                tail = mid;
            }
            if (target.compareTo(strings[mid]) > 0) {
                head = mid;
            }
        }
    }
}
