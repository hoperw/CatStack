package com.hopewatson;

class CatStack extends AbstractStack<Cat> {

    public CatStack(int size) {
        super(size);
    }

    @Override
    protected Class<Cat> getClazz() {
        return Cat.class;
    }

    @Override
    protected void printStack() {

        int i = 0;
        while (this.getStack()[i] != null) {

            System.out.println(this.getStack()[i].toString());
            i++;
        }
    }
}