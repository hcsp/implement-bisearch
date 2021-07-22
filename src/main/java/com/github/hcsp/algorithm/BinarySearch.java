package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
//        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式


//    public static int binarySearch(String[] strings, String target) {
//        return binarySearch(strings, target, 0);
//    }

//    public static int binarySearch(String[] strings, String target, int lastStart) {
//        int start = 0, end = strings.length - 1;
//        char targetInitial = target.charAt(0);
//        char startInitial = strings[start].charAt(0);
//        char endInitial = strings[end].charAt(0);
//        int mid = (start + end) / 2;
//        char midInitial = strings[mid].charAt(0);
//        if (strings[start].equals(target)) {
//            return start;
//        }
//
//        if (strings[end].equals(target)) {
//            return end;
//        }
//        if (startInitial > targetInitial || endInitial < targetInitial || end == start + 1) {
//            return -1;
//        }
//
//        List<String> stringList = Arrays.asList(strings);
//        if (midInitial > targetInitial) {
//            String[] newStrings = new String[mid - start];
//            newStrings = stringList.subList(start, mid + 1).toArray(newStrings);
//            return binarySearch(newStrings, target, start);
//        } else if (midInitial < targetInitial) {
//            String[] newStrings = new String[end - mid];
//            newStrings = stringList.subList(mid, end + 1).toArray(newStrings);
//            return binarySearch(newStrings, target, mid);
//        } else {
//            return mid + lastStart;
//        }
//    }
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length - 1;
        char targetInitial = target.charAt(0);
        while (true) {
            if (strings[start].equals(target)) {
                return start;
            }

            if (strings[end].equals(target)) {
                return end;
            }

            int mid = (start + end) / 2;
            char startInitial = strings[start].charAt(0);
            char endInitial = strings[end].charAt(0);
            char midInitial = strings[mid].charAt(0);

            if (startInitial > targetInitial || endInitial < targetInitial || end == start + 1) {
                return -1;
            }

            if (midInitial > targetInitial) {
                end = mid;
            } else if (midInitial < targetInitial) {
                start = mid;
            } else {
                return mid;
            }
        }
    }
}
