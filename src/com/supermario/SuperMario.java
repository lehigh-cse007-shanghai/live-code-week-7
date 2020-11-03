package com.supermario;

public class SuperMario {
    public String name = "Super Mario";
    public int strength = 10; // 力量
    public int agility = 10; // 敏捷
    public int intelligence = 10;  //智力

    public void fightDuck(Duck duck){

        if( this.strength >= duck.strength && this.agility >= duck.agility
                && this.intelligence >= duck.intelligence)
            System.out.println("Super Mario wins!");
        else System.out.println("Duck wins!");

    }

    public void fightTortoise(Tortoise tortoise){
        if( this.strength >= tortoise.strength && this.agility >= tortoise.agility
                && this.intelligence >= tortoise.intelligence)
            System.out.println("Super Mario wins!");
        else System.out.println("Tortoise wins!");
    }

    public void fightDragon(Dragon dragon){
        if( this.strength >= dragon.strength && this.agility >= dragon.agility
                && this.intelligence >= dragon.intelligence)
            System.out.println("Super Mario wins!");
        else System.out.println("Dragon wins!");

    }
}
