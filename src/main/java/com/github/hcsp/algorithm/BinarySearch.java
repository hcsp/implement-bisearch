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
        //取出开头与结尾
        int start = 0, end = strings.length - 1;

        return recursion(strings, target, start, end);
    }

    public static int recursion(String[] strings, String target, int start, int end) {
        if (target.equals(strings[start])) {
            return start;
        }

        if (target.equals(strings[end])) {
            return end;
        }

        //判断排序情况下不存在元素的情况下 不在范围内 转换为arscll 码进行比较
        if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
            return -1;
        }

        //把数组分为两个区间 如果元素在其中某一个区间内 再从那个区间中查找元素 以减少遍历的次数
        int separate = (start + end) / 2;

        if (target.compareTo(strings[separate]) < 0) {
            //把查找的结束范围指针 移动到左边区间 较小的区间范围 进行下一次查找
            //结束指针同时向前移动一位 缩小查询范围
            return recursion(strings, target, start, separate - 1);
        } else if (target.compareTo(strings[separate]) > 0) {
            //把查找的起始范围指针 移动到右边区间 较大的区间范围 进行下一次查找
            //起始指针同时向后移动一位 缩小查询范围
            return recursion(strings, target, separate + 1, end);
        } else {
            //如果区分范围的指针位置等于查找的元素 则直接返回
            return separate;
        }
    }


}
