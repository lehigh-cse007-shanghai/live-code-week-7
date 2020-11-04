package com.supermario;

public class Monster {
    public String name = "Monster";
    public int strength = 1; // 力量
    public int agility = 1; // 敏捷
    public int intelligence = 1;  //智力

    public void whoAmI(){
        System.out.println("I am a " + this.name);
    }
}
