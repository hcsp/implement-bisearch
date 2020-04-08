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
        int low = 0;
        int high = strings.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            String midStr = strings[mid];
            int compare = target.compareTo(midStr);

            if (compare < 0) {
                high = mid - 1;
            } else if (compare > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(String[] strings, String target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        String midStr = strings[mid];

        int compare = target.compareTo(midStr);
        if (compare < 0) {
            high = mid - 1;
        } else if (compare > 0) {
            low = mid + 1;
        } else {
            return mid;
        }

        return recursiveBinarySearch(strings, target, low, high);
    }
}
