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
//        while (true) {
//            if (target.equals(strings[start])) {
//                return start;
//            }
//            if (target.equals(strings[end])) {
//                return end;
//            }
//            if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
//                return -1;
//            }
//            int mux = (start + end) / 2;
//            if (target.compareTo(strings[mux]) > 0) {
//                start = mux + 1;
//            } else if (target.compareTo(strings[mux]) < 0) {
//                end = mux - 1;
//            } else {
//                return mux;
//            }
//        }
        return binarySearch(strings, target, start, end);
    }

    public static int binarySearch(String[] strings, String target, int start, int end) {
        if (target.equals(strings[start])) {
            return start;
        }
        if (target.equals(strings[end])) {
            return end;
        }
        if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
            return -1;
        }
        int mux = (start + end) / 2;
        if (target.compareTo(strings[mux]) > 0) {
            return binarySearch(strings, target, mux + 1, end);
        } else if (target.compareTo(strings[mux]) < 0) {
            return binarySearch(strings, target, start, mux - 1);
        } else {
            return mux;
        }
    }

}
