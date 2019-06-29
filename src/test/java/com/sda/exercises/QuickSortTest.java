package com.sda.exercises;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortTest {

    @Test
    public void sort() {
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(5, 3, 1, 2, 4));
        QuickSort quickSort = new QuickSort();
        quickSort.sort(unsortedList, 0, unsortedList.size() - 1);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(unsortedList, expected);
    }
}