package com.szilard;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();

        List<Integer> numberList = Arrays.asList(5, 2, 86, 5, 43, 25, 3, 111, 59, 47);

        quickSort.sort(numberList);

        System.out.println(numberList);
    }
}
