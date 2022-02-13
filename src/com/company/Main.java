package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Animal[] animal = {new Shark(), new Turtle(), new Eage()};

        for (Animal animals : animal) {
            if (animals instanceof Shark) {
                ((Shark) animals).attack();
            } else if (animals instanceof Turtle) {
                ((Turtle) animals).swim();
            } else if (animals instanceof Eage) {
                animals.fly();

            }
            Shark[] sharks = new Shark[animal.length];
            Turtle[] turtles = new Turtle[animal.length];
            Eage[] eages = new Eage[animal.length];

            for (Animal i : animal)
                if (i instanceof Shark) {
                    sharks[0] = new Shark();
                } else if (i instanceof Turtle) {
                    turtles[1] = new Turtle();
                } else if (i instanceof Eage) {
                    eages[2] = new Eage();
                }


        }
    }
}