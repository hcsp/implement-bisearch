package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
//    public static int binarySearch(String[] strings, String target) {
//        int last = strings.length - 1;
//        int first = 0;
//        int result;
//        while (true) {
//            if (target.compareTo(strings[first]) == 0) {
//                result = first;
//                break;
//            }
//            int middle = (last + first) % 2 == 0 ? (last + first) / 2 : (last + first) / 2 + 1;
//            if (target.compareTo(strings[middle]) > 0) {
//                first = middle;
//            } else if (target.compareTo(strings[middle]) < 0){
//                if (last == middle) {
//                    result = -1;
//                    break;
//                }
//                last = middle;
//            } else {
//                result = middle;
//                break;
//            }
//        }
//        return result;
//    }
    // 递归
    static int search(int first, int last, String[] strings, String target) {
        if (target.compareTo(strings[first]) == 0) {
            return first;
        }
        int middle = (last + first) % 2 == 0 ? (last + first) / 2 : (last + first) / 2 + 1;
        if (target.compareTo(strings[middle]) > 0) {
            return search(middle, last, strings, target);
        } else if (target.compareTo(strings[middle]) < 0){
            if (last == middle) {
                return -1;
            }
            return search(first, middle, strings, target);
        } else {
            return middle;
        }

    }
    public static int binarySearch(String[] strings, String target) {
        int last = strings.length - 1;
        int first = 0;
        return search(first, last, strings, target);
    }
}
