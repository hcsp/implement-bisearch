package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy", 0, 4));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length - 1;
        while (true) {
            int mid = (start + end) / 2;
            System.out.println(start + "-" + mid + "-" + end);
            if (target.equals(strings[start])) {
                return start;
            }
            if (target.equals(strings[end])) {
                return end;
            }

            if (start == end) {
                return -1;
            }

            if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
                return -1;
            }

            int res = target.compareTo(strings[mid]);

            if (res == 0) {
                return mid;
            } else if (res > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
    }

    public static int binarySearch(String[] strings, String target, int start, int end) {
        int mid = (start + end) / 2;
        if (target.equals(strings[start])) {
            return start;
        }
        if (target.equals(strings[end])) {
            return end;
        }
        if (start == end) {
            return -1;
        }
        int res = target.compareTo(strings[mid]);

        if (res == 0) {
            return mid;
        } else if (res > 0) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        return binarySearch(strings, target, start, end);
    }
}
