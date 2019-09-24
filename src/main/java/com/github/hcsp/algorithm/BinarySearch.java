package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
//        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
        String[] array = "a quick brown fox jumps over the lazy dog".split(" ");
        System.out.println(BinarySearch.binarySearch(array, "the"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {

        int start = 0, end = strings.length - 1;

        while (true) {
            String strInStartPoint = strings[start];
            String strInEndPoint = strings[end];
            if (strInStartPoint.equals(target)) {
                return start;
            }
            if (strInEndPoint.equals(target)) {
                return end;
            }
            if (strInStartPoint.compareTo(target) > 0 || strInEndPoint.compareTo(target) < 0) {
                return -1;
            }
            int mid = (start + end) / 2;
            String strInMiddle = strings[mid];
            if (strInMiddle.compareTo(target) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
