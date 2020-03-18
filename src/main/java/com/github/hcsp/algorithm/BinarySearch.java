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

        /*for (int i = 0; i < strings.length; i++) {
            if (strings[i] == target) {
                return i;
            }

        }return -1;*/

        int start = 0;
        int end = strings.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target.compareTo(strings[mid]) < 0) {
                end = mid - 1;

            } else if (target.compareTo(strings[mid]) > 0) {
                start = mid + 1;

            } else {
                return mid;
            }


        }
        return -1;
    }


    public static int recursionBinarySearch(String[] strings, String target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2; //注意
        if (strings[mid].charAt(0) > target.charAt(0)) {   //比较首字母
            return recursionBinarySearch(strings, target, start, mid - 1);
        } else if (strings[mid].charAt(0) < target.charAt(0)) {
            return recursionBinarySearch(strings, target, mid + 1, end);
        } else {
            return mid;
        }


    }


}
