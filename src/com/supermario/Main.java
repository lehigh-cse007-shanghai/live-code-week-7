/*
 @author: lunde chen
 @email: lundechen@shu.edu.cn
 */

package com.supermario;

public class Main {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.whoAmI();
        SuperMario superMario = new SuperMario();
        Duck duck = new Duck();
        Tortoise tortoise = new Tortoise();
        superMario.fightMonster(duck);
        superMario.fightMonster(dragon);
        superMario.fightMonster(tortoise);
    }
}
