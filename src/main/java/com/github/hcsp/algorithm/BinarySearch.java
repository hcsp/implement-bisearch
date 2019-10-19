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
        //递归法
        /*int length = strings.length;
        int tem = length / 2;
        if (length == 1) {
            if (strings[tem].compareTo(target) == 0) {
                return 0;
            } else {
                return -1;
            }
        }
        if (target.compareTo(strings[tem]) > 0) {
            //往下半部分找
            int a = binarySearch(Arrays.copyOfRange(strings, tem, length), target);
            if (a == -1) {
                return -1;  //找不到,返回-1;
            } else {
                return tem + a;//找到了,返回:实际位置=当前位置+子数组中位置
            }
        }
        if (target.compareTo(strings[tem]) < 0) {
            //往上半部分找
            return binarySearch(Arrays.copyOfRange(strings, 0, tem), target);
        }
        return tem;*/
        //非递归
        int length = strings.length;
        int tem;
        int lowPos = 0;
        int highPos = length - 1;
        while (highPos >= lowPos) {
            tem = (lowPos+highPos) / 2;
            int res = target.compareTo(strings[tem]);
            if (res == 0) {
                return tem;
            }
            if (res > 0) {
                lowPos = tem + 1;
            } else {
                highPos = tem - 1;
            }
        }
        return -1;
    }
}
