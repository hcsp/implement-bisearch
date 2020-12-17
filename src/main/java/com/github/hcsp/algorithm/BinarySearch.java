package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        int position;
        while (start <= end) {
            position = (start + end) / 2;
            if (strings[position].compareTo(target) > 0) {
                System.out.printf("查找记录: start=%d end=%d position =%d %s > %s%n", start, end, position,
                        strings[position], target);
                end = position - 1;
            } else if (strings[position].compareTo(target) < 0) {
                System.out.printf("查找记录: start=%d end=%d position =%d %s < %s%n", start, end, position,
                        strings[position], target);
                start = position + 1;
            } else {
                System.out.printf("查找记录: start=%d end=%d position =%d %s = %s%n", start, end, position,
                        strings[position], target);
                System.out.println("索引是" + position);
                return position;
            }
        }
        return -1;

    }
}
