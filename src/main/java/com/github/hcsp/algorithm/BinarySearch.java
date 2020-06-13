package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));

        System.out.println(binarySearchDiGui(0, 4, new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearchDiGui(0, 4, new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int left = 0, right = strings.length - 1;
        while (true) {
            if (strings[left].compareTo(target) == 0) {
                return left;
            }
            if (strings[right].compareTo(target) == 0) {
                return right;
            }
            if (target.compareTo(strings[left]) < 0 || target.compareTo(strings[right]) > 0) {
                return -1;
            }
            int mid = (left + right) / 2;
            if (target.compareTo(strings[mid]) < 0) {
                right = mid - 1;
            } else if (target.compareTo(strings[mid]) > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
    }

    public static int binarySearchDiGui(int left, int right, String[] strings, String target) {
        int mid = left + right / 2;
        if (strings[left].compareTo(target) == 0) {
            return left;
        }
        if (strings[right].compareTo(target) == 0) {
            return right;
        }
        if (target.compareTo(strings[left]) < 0 || target.compareTo(strings[right]) > 0) {
            return -1;
        }
        if (target.compareTo(strings[mid]) < 0) {
            return binarySearchDiGui(left, mid - 1, strings, target);
        } else if (target.compareTo(strings[mid]) > 0) {
            return binarySearchDiGui(mid + 1, right, strings, target);
        } else {
            return mid;
        }
    }
}
