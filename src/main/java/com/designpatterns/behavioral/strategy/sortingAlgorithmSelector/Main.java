package com.designpatterns.behavioral.strategy.sortingAlgorithmSelector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 3, 1};

        SortContext context = new SortContext();

        // Use Bubble Sort
        context.setStrategy(new BubbleSortStrategy());
        context.sortArray(numbers);
        System.out.println(Arrays.toString(numbers));

        // Use Quick Sort
        int[] numbers2 = {5, 2, 8, 3, 1};
        context.setStrategy(new QuickSortStrategy());
        context.sortArray(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // Use Merge Sort
        int[] numbers3 = {5, 2, 8, 3, 1};
        context.setStrategy(new MergeSortStrategy());
        context.sortArray(numbers3);
        System.out.println(Arrays.toString(numbers3));
    }
}
