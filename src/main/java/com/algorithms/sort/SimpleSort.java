package com.algorithms.sort;

import java.util.Arrays;

import static com.algorithms.sort.SortUtils.*;

/**
 * @author dingjuru
 * @date 2021/12/27
 */
public class SimpleSort {


    public <T extends Comparable<T>> T[] sort(T[] array) {

        final int LENGTH = array.length;
        for (int i = 0; i < LENGTH; i++) {
            for (int j = i+1; j < LENGTH; j++) {
                if(less(array[j], array[i])) {
                    T element = array[j];
                    array[j] = array[i];
                    array[i] = element;
                }
            }
        }

        return array;
    }


    public static void main(String[] args) {

        Integer[] a = {3, 7, 45, 3, 66, 2, 9};
        print(a);
        new SimpleSort().sort(a);
        print(a);


    }

}
