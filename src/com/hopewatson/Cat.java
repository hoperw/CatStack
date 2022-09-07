package com.hopewatson;

public class Cat {

    private String type;
    private int friendlyScale;

    Cat(String type, int friendly) {
        this.type = type;
        this.friendlyScale = friendly;
    }
    public void meow() {
        System.out.println("Meow, meow...");
    }
    private boolean isFriendly() {
        return this.friendlyScale > 5;
    }

    @Override
    public String toString() {
        String temperment = isFriendly() ? "friendly" : "kind of mean";
        return "This cat is a " + temperment + " " + this.type;
    }
}
