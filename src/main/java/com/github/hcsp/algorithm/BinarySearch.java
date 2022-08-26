package com.github.hcsp.algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(
                binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "fff"));
        System.out.println(
                binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "zzz"));
//        String[] array = "a quick brown fox jumps over the lazy dog".split(" ");
//        Arrays.sort(array); // array = [a, brown, dog, fox, jumps, lazy, over, quick, the]
//        binarySearch(array, "the");
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length - 1, result = 0;
        if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
            return -1;
        }
        if (strings[start].compareTo(target) == 0) {
            return start;
        } else if (strings[end].compareTo(target) == 0) {
            return end;
        }
        int mid = (start + end) / 2;
        if (mid == start || mid == end) {
            return -1;
        }
        if (strings[mid].compareTo(target) < 0) {
            result = binarySearch(Arrays.copyOfRange(strings, mid, end + 1), target);
        } else if (strings[mid].compareTo(target) > 0) {
            result = binarySearch(Arrays.copyOfRange(strings, start, mid + 1), target);
        }
        return result == -1 ? -1 : result + mid;

    }
}
