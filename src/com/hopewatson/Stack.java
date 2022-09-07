package com.hopewatson;

public interface Stack<T> {

    boolean isEmpty();
    T peek();
    boolean push(T obj);
    T pop();

}
