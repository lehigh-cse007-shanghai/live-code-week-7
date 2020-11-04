package com.supermario;

public class SuperMario {
    public String name = "Super Mario";
    public int strength = 10; // 力量
    public int agility = 10; // 敏捷
    public int intelligence = 10;  //智力

    public void fightMonster(Monster monster){

        if( this.strength >= monster.strength && this.agility >= monster.agility
                && this.intelligence >= monster.intelligence)
            System.out.println("Super Mario wins!");
        else System.out.println(monster.name + " wins!");

    }

}
