package com.algorithms.datastructures.hashmap.hashing;


import java.util.Scanner;

/**
 * @author dingjuru
 * @date 2021/12/30
 */
public class TestHashMap {
    public static void main(String[] args) {

        int choice, key;

        HashMapLink h = new HashMapLink(1);
        Scanner In = new Scanner(System.in);
        while (true){
            System.out.println("选择你的操作：");
            System.out.println("1. 添加key");
            System.out.println("2. 删除key");
            System.out.println("3. 输出hash");
            System.out.println("4. 结束");

            choice = In.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("输入添加的key：");
                    key = In.nextInt();
                    h.insertHash(key);
                    break;
                case 2:
                    System.out.println("输入删除的key：");
                    key = In.nextInt();
                    h.deleteHash(key);
                    break;
                case 3:
                    System.out.println("输出hash：");
                    h.displayHashtable();
                    break;
                case 4:
                default:
                    In.close();
                    break;
            }

        }
    }
}
