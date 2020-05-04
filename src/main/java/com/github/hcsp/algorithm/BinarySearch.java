package com.github.hcsp.algorithm;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(binarySearch2(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
    System.out.println(binarySearch2(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
  }

  // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
  // 如果未找到，返回-1
  // 我们鼓励你使用递归和非递归两种方式
  public static int binarySearch(String[] strings, String target) {
    return binarySearchInner(strings, 0, strings.length, target);
  }

  public static int binarySearchInner(String[] strings, int lo, int hi, String target) {
    if (hi < lo) {
      return -1;
    }

    int mid = lo + (hi - lo) / 2;
    if (strings[mid].compareTo(target) == 0) {
      return mid;
    } else if (strings[mid].compareTo(target) > 0) {
      return binarySearchInner(strings, lo, mid - 1, target);
    } else {
      return binarySearchInner(strings, mid + 1, hi, target);
    }
  }

  public static int binarySearch2(String[] strings, String target) {
    int lo = 0;;
    int hi = strings.length;
    int mid = (hi - lo) / 2;
    while(hi >= lo) {
      int a = strings[mid].compareTo(target);

      if (a == 0) {
        return mid;
      } else if (a < 0) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }

      mid = lo + (hi - lo) / 2;
    }

    return -1;
  }
}
