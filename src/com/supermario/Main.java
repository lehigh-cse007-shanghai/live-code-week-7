/*
 @author: lunde chen
 @email: lundechen@shu.edu.cn
 */

package com.supermario;

public class Main {

    public static void main(String[] args) {
        SuperMario superMario = new SuperMario();
        Duck duck = new Duck();
        Dragon dragon = new Dragon();
        Tortoise tortoise = new Tortoise();
        superMario.fightDuck(duck);
        superMario.fightDragon(dragon);
        superMario.fightTortoise(tortoise);
    }
}
