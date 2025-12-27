package com.designpatterns.behavioral.strategy.sortingAlgorithmSelector;

public class SortContext {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] numbers) {
        if (strategy == null) {
            throw new IllegalStateException("SortStrategy is not set!");
        }
        strategy.sort(numbers);
    }
}
