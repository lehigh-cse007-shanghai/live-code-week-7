package com.supermario;

public class Dragon extends Monster {

    public Dragon(int i, int s, int a){
        this.name = "Dragon";
        this.intelligence = i;
        this.strength = s;
        this.agility = a;
    }

    public Dragon(){
        this.name = "Dragon";
        this.intelligence = 12;
        this.strength = 13;
        this.agility = 11;
    }

}
