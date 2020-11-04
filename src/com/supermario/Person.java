package com.supermario;

public class Person {

    public void liveADay(){
        System.out.println("Get up from bed");
        System.out.println("Take breakfast");
        doTheMainTaskOfTheDay();
        System.out.println("Go back home");
        doSomeRecreationalStuff();
        System.out.println("Go to sleep");
    }

    public void doTheMainTaskOfTheDay(){
    }

    public void doSomeRecreationalStuff(){
    }
}

class Student extends Person{
    public void doTheMainTaskOfTheDay(){
        System.out.println("Studying and programming is my work");
    }

    public void doSomeRecreationalStuff(){
        System.out.println("Playing video games as entertainment");
    }
}

class Doctor extends Person{
    public void doTheMainTaskOfTheDay(){
        System.out.println("Do surgeries, cure diseases");
    }

    public void doSomeRecreationalStuff(){
        System.out.println("Read books");
    }
}





