package com.hopewatson;

import java.lang.reflect.Array;

public abstract class AbstractStack<T> implements Stack<T> {

    protected int top;
    private int size;
    private T[] stack;

    public AbstractStack(int size) {
        if (size < 2) {
            throw new IllegalArgumentException("Stack size must be greater than 2");
        } else {
            this.top = -1;
            this.size = size;
            this.stack = (T[]) Array.newInstance(getClazz(), size);
        }
    }

    protected abstract Class<T> getClazz();
    protected abstract void printStack();

    public boolean isEmpty() {
        return this.top == -1;
    }
    public T peek() {
        if (isEmpty()) {
            try {
                throw new Exception("Stack is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return stack[this.top];
    }
    public boolean push(T obj) {

        boolean added = false;

        if (this.top < this.size) {
            this.top++;
            this.stack[top] = obj;
            added = true;
        }
        return added;
    }
    public T pop() {

        T popped;

        if (isEmpty()) {
            popped = null;
        } else {
            popped = stack[top];
            this.stack[top] = null;
            this.top--;
        }
        return popped;
    }
    public T[] getStack() {
        return this.stack;
    }
}
