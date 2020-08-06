/**
 * @Date        : 2020-08-06 09:53:56
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-08-06 10:25:58
 * @FilePath    : \java\java-course\my_test\generics.java
 * @Describe    : 
 */
// package my_test;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<Object>();

        al.add("哈哈");
        al.add(2);
        al.add(true);
        al.addAll(al);
        System.out.println(al);
    }
}