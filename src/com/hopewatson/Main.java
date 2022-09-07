package com.hopewatson;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        /* Random Testing Object */
        SecureRandom rand = new SecureRandom();
        String[] catTypes = {"calico", "siamese", "black cat", "flamepoint"};


        NumberStack numStack = new NumberStack(10);
        CatStack catStack = new CatStack(10);

        /* Empty NumberStack Tests */

        /*
        // print out an empty stack
        System.out.println("Empty Stack: \n");
        numStack.printStack();

        // try to pop from empty stack
        System.out.println("\nTrying to Use Pop Empty Stack....\n");
        System.out.println("At the top of the stack is: " + numStack.pop());

        // add to stack
        System.out.println("\nAdding to Stack....\n");
        int totalAdded = rand.nextInt(10);
        int numToAdd;
        for (int i = 0; i < totalAdded; i++) {
            numToAdd = rand.nextInt(1000);
            numStack.push(numToAdd);
        }
        numStack.printStack();
        */

        /* Empty CatStack Tests */

        // print out an empty stack
        System.out.println("Empty Stack: \n");
        numStack.printStack();

        // try to pop from empty stack
        System.out.println("\nTrying to Use Pop Empty Stack....\n");
        System.out.println("At the top of the stack is a: " + numStack.pop());

        // add to stack
        System.out.println("\nAdding to Stack....\n");
        int totalAdded = rand.nextInt(10);
        int friendliness;
        Cat catToAdd;
        String catType;

        for (int i = 0; i < totalAdded; i++) {
            friendliness = rand.nextInt(10);
            catType = catTypes[rand.nextInt(3)];
            catToAdd = new Cat(catType, friendliness);
            catStack.push(catToAdd);
            System.out.println(catToAdd.toString());
        }
        catStack.printStack();


    }
}
