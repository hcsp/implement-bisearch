package com.github.hcsp.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void test() {
        String[] array = "a quick brown fox jumps over the lazy dog".split(" ");
        Assertions.assertEquals(6, BinarySearch.binarySearch(array, "the"));
        Assertions.assertEquals(-1, BinarySearch.binarySearch(array, "aaa"));
    }
}
