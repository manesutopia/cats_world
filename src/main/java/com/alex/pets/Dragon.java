package com.alex.pets;


import com.alex.exceptions.PetIsDeadException;

public class Dragon extends Pet implements Alive {
    private String name;
    private String breath;

    public Dragon(String someName, String breath) {
        this.name = someName;
        this.breath = breath;
    }

    public void fly() {

        if (!isAlive())
            throw new PetIsDeadException(this);

        if (isAlive) {
            System.out.println("Dragon " + name + " is flying");
        } else {

            System.out.println("Dragon " + name + " killed by Dovahkiin");
        }

    }

    public void eat(Sheep sheep) {
        if (isAlive) {
            sheep.kill();
            System.out.println("Dragon " + name + " eat " + Sheep.getName());
        } else {
            System.out.println("Dragon " + name + " is hungry(pls feed me :C)");
        }
    }

    public String getName() {
        return name;
    }

    public String getBreath() {
        return breath;
    }

    public String toString() {
        return "Dragon " + name;
    }
}
