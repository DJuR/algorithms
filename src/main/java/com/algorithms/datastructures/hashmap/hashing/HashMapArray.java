package com.algorithms.datastructures.hashmap.hashing;

import java.util.Arrays;

/**
 * @author dingjuru
 * @date 2021/12/30
 */
public class HashMapArray {
    private int hsize;
    private Integer[] buckets;
    private int size;

    public HashMapArray(int hsize) {
        this.buckets = new Integer[hsize];
        this.hsize = hsize;
        this.size = 0;
    }

    public int hashing(int key) {
        int hash = key % hsize;
        if(hash < 0) {
            hash += hsize;
        }
        return hash;
    }

    public void insertHash(int key) {
        int hash = hashing(key);

        if(isFull()) {
            System.out.println("Hash table is full.");
            return;
        }

        for (int i = 0; i < hsize; i++) {
            if(buckets[hash] == null) {
                buckets[hash] = key;
                size++;
                return;
            }

            if(hash + 1 < hsize) {
                hash++;
            } else {
                hash = 0;
            }
        }
    }

    public void deleteHash(int key) {
        if(isEmpty()) {
            System.out.println("Table is empty.");
            return;
        }

        int hash = hashing(key);
        for (int i = 0; i < hsize; i++) {
            if(buckets[hash] != null && buckets[hash] == key) {
                buckets[hash] = null;
                size--;
                return;
            }

            if(hash + 1 < hash) {
                hash++;
            } else {
                hash = 0;
            }
        }
    }

    public int findHash(int key) {
        int hash = hashing(key);

        if(isEmpty()){
            System.out.println("Table is empty");
            return -1;
        }

        for (int i = 0; i < hsize; i++) {
            if(buckets[hash].equals(key)) {
                return hash;
            }

            if(hash + 1 < hsize) {
                hash++;
            } else {
                hash = 0;
            }
        }

        System.out.println("Key " + key + " not found.");
        return -1;
    }

    /**
     * 空间大小扩容2倍
     */
    private void expander() {
        buckets = Arrays.copyOf(buckets, hsize*1);
        hsize *= 2;
        System.out.println("table size is now:" + hsize);
    }

    public void checkLoadFactor() {
        double factor = (double) size / hsize;
        if(factor > .7) {
            System.out.println("Load factor is " + factor + ", lengthening table");
            expander();
        } else {
            System.out.println("Load factor is " + factor);
        }

    }

    public void display() {
        for (int i = 0; i < hsize; i++) {
            System.out.println("Buckets " + i + ":" + buckets[i]);
        }
    }

    public boolean isFull() {
        return  hsize == size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
