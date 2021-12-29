package com.algorithms.datastructures.hashmap.hashing;


import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * @author dingjuru
 * @date 2021/12/28
 */
public class HashMap {
    private int hsize;
    private LinkedList[] buckets;

    public HashMap(int hsize) {
        buckets = new LinkedList[hsize];
        for (int i = 0; i < hsize; i++) {
            buckets[i] = new LinkedList();
        }
        this.hsize = hsize;
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

    }

    public static class LinkedList{
        private Node first;
        public LinkedList(){
            first = null;
        }

        public void insert(int key) {
            if(isEmpty()) {
                first = new Node(key);
                return;
            }

            Node temp = findEnd(first);
            temp.setNext(new Node(key));
        }

        private Node findEnd(Node n) {
            if(n.getNext() ==null) {
                return n;
            } else {
                return findEnd(n.getNext());
            }
        }

        public boolean isEmpty(){
            return first == null;
        }
    }

    public static class Node{
        private Node next;
        private int key;

        public Node(int key){
            next = null;
            this.key = key;
        }

        public Node getNext() {
            return next;
        }

        public int getKey() {
            return key;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
