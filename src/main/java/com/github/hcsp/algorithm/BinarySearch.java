package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        print(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        print(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int first = 0;
        int last = strings.length;
        int mid;

        while (last >= first) {
            mid = (first + last) / 2;

            if (strings[mid] == target) {
                return mid;
            }
            else if (strings[mid].compareTo(target) > 0) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void print(int number) {
        System.out.println(number);
    }
}
