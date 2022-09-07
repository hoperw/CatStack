package com.hopewatson;

public class NumberStack extends AbstractStack<Number>{


    public NumberStack(int size) {
        super(size);
    }

    @Override
    protected Class<Number> getClazz() {
        return Number.class;
    }

    @Override
    protected void printStack() {
        for (int i = 0; i < this.getStack().length; i++) {
            System.out.println(this.getStack()[i]);
        }
    }
}
