package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    // non-recursive way
    public static int binarySearch(String[] strings, String target) {
        int lowIndex = 0;
        int highIndex = strings.length -1;
        int middleIndex;

        while (lowIndex <= highIndex){
            middleIndex = (lowIndex + highIndex) >>> 1;
            String middleValue = strings[middleIndex];
            int compareResult = target.compareTo(middleValue);

            if (compareResult < 0){
                highIndex = middleIndex -1;
            } else if (compareResult > 0){
                lowIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

    // recursive way
    public static int binarySearchRecursive(String[] strings, String target) {
        int lowIndex = 0;
        int highIndex = strings.length -1;

        return binarySearchRecursive(strings, target, lowIndex, highIndex);
    }

    private static int binarySearchRecursive(String[] strings, String target, int lowIndex, int highIndex) {
        if (lowIndex > highIndex) {
            return -1;
        }
        int middleIndex = (lowIndex + highIndex) >>> 1;
        String middleValue = strings[middleIndex];
        int compareResult = target.compareTo(middleValue);

        if (compareResult == 0){
            return middleIndex;
        } else if (compareResult < 0){
            return binarySearchRecursive(strings, target, lowIndex, middleIndex-1);
        } else {
            return binarySearchRecursive(strings, target, middleIndex +1, highIndex);
        }
    }
}
