package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return "Cluck";
    }

    public Edible yield() {
        return new Egg();
    }

}
