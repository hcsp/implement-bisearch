package com.github.hcsp.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySearchTest {
    @Test
    public void test() {
        String[] array = "a quick brown fox jumps over the lazy dog".split(" ");
        Arrays.sort(array); // array = [a, brown, dog, fox, jumps, lazy, over, quick, the]
        Assertions.assertEquals(8, BinarySearch.binarySearch(array, "the"));
        Assertions.assertEquals(-1, BinarySearch.binarySearch(array, "aaa"));
    }
}
