package com.codecool;

import com.codecool.adapter.AdapterRunner;
import com.codecool.binarysearch.BinarySearchRunner;
import com.codecool.bubblesort.BubbleSortRunner;
import com.codecool.builder.BuilderRunner;
import com.codecool.decoratedduck.DecoratedDuckRunner;
import com.codecool.decorator.DecoratorRunner;
import com.codecool.duck.DuckGame;
import com.codecool.facade.FacadeRunner;
import com.codecool.factory.FactoryRunner;
import com.codecool.insertionsort.InsertionSortRunner;
import com.codecool.mediator.MediatorRunner;
import com.codecool.mergesort.MergeSortRunner;
import com.codecool.mvc.MvcRunner;
import com.codecool.observer.ObserverRunner;
import com.codecool.quicksort.QuickSort;
import com.codecool.quicksort.QuickSortRunner;
import com.codecool.repository.RepositoryRunner;
import com.codecool.selectionsort.SelectionSortRunner;
import com.codecool.singleton.SingletonRunner;
import com.codecool.strategy.StrategyRunner;

public class Main {

    public static void main(String[] args) {
        //designPatternsRunner();
        algorithmsRunner();
    }

    private static void designPatternsRunner() {
        //DuckGame.run();
        //BuilderRunner.run();
        //FactoryRunner.run();
        //SingletonRunner.run();
        //AdapterRunner.run();
        //DecoratorRunner.run();
        //FacadeRunner.run();
        //MediatorRunner.run();
        //ObserverRunner.run();
        //StrategyRunner.run();
        //RepositoryRunner.run();
        //MvcRunner.run();
        //DecoratedDuckRunner.run();
    }

    private static void algorithmsRunner() {
        long startTime = System.currentTimeMillis();
        //BubbleSortRunner.run(); 32ms
        //InsertionSortRunner.run(); 18ms
        //SelectionSortRunner.run(); 19ms
        //QuickSortRunner.run(); 25ms
        //MergeSortRunner.run(); // 8ms
        //BinarySearchRunner.run();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println();
        System.out.println("Time: " + elapsedTime + "ms");
    }
}
