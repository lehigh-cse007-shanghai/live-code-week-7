package com.supermario;

public class Duck extends Monster implements Fightable {


    public Duck(){
        this.name = "Duck";
        this.intelligence = 5;
        this.strength = 7;
        this.agility = 6;
    }

    public void fight(){
        System.out.println("I will fight as a good " + this.name);
    }
}
