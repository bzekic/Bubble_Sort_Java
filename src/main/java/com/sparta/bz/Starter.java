package com.sparta.bz;

import java.util.Arrays;

public class Starter
{
    public static void main( String[] args ) {
        int[] arrayToSort = {3, 7, 6, 2, 5};
        BubbleSort sorter = new BubbleSort();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        System.out.println( Arrays.toString(sortedArray));
    }
}
