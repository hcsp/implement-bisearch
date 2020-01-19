package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        String[] A1 = {"aaa", "ccc", "fff", "yyy", "zzz"};
        String[] A2 = {"aaa", "ccc", "fff", "yyy", "zzz"};

        System.out.println(binarySearch(A1, "bbb"));
        System.out.println(binarySearch(A2,"yyy"));

        System.out.println(binarySearchByRecursion(A1, "bbb", 0, A1.length-1));
        System.out.println(binarySearchByRecursion(A2, "yyy", 0, A2.length-1));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {

        return -1;
    }

    public static int binarySearchByRecursion(String[] strings, String target, int start, int end){

        return -1;
    }

}
