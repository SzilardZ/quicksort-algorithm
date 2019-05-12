package com.szilard;

import java.util.List;
import java.util.Random;

public class QuickSort {

    public void sort(List<Integer> toSort) {

        if(toSort == null) {
            throw new IllegalArgumentException();
        }
        else {
            quickSort(toSort, 0, toSort.size() - 1);
        }
    }

    private void quickSort(List<Integer> toSort, int low, int high) {

        if(low < high + 1) {
            int partition = partition(toSort, low, high);
            quickSort(toSort, low, partition-1);
            quickSort(toSort, partition+1, high);
        }
    }

    private int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }

    private int partition(List<Integer> toSort, int low, int high) {
        swap(toSort, low, getPivot(low, high));
        int border = low + 1;
        for(int i=border; i<=high; i++) {
            if(toSort.get(i) < toSort.get(low)) {
                swap(toSort, i, border++);
            }
        }
        swap(toSort, low, border-1);
        return border-1;
    }

    private void swap(List<Integer> toSort, int index1, int index2) {
        int temp = toSort.get(index1);
        toSort.set(index1, toSort.get(index2));
        toSort.set(index2, temp);
    }
}
