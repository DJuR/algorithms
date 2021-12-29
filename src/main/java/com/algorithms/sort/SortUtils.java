package com.algorithms.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @author dingjuru
 * @date 2021/12/27
 */
final class SortUtils {

    /**
     * 验证v是否小于w
     * @param v
     * @param w
     * @param <T>
     * @return if v < w true else false
     */
    static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 输出list
     * @param toPrint
     */
    static void print(List<?> toPrint) {
        toPrint.stream().map(Object::toString).map(str -> str + "").forEach(System.out::print);
        System.out.println();
    }

    /**
     * 输出数组
     * @param toPrint
     */
    static void print(Object[] toPrint) {
        System.out.println(Arrays.toString(toPrint));
    }
}
