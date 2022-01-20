package com.algorithms.com.learn.util;

import java.util.Collection;
import  java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

/**
 * @author dingjuru
 * @date 2021/12/30
 */
public class TestHashMap {
    public static void main(String[] args) {
       HashMap<Object, Object> hashMap1 = new HashMap<>(1);
       hashMap1.put(1,1);
       HashMap<Object, Object> hashMap2 = new HashMap<>(2);
        hashMap2.put(2,3);

        HashMap<Object, Object> hashMap3 = new HashMap<>();
        // 合并map
        hashMap3.putAll(hashMap1);
        hashMap3.putAll(hashMap2);

        Set<Object> objects = hashMap3.keySet();
        System.out.println(objects);
        Collection<Object> values = hashMap3.values();
        System.out.println(values);

        new Hashtable<String, String>(1);







    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
