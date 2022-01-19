package sti.abstractions.entity;

import java.io.Serializable;

public class SquirrelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private int age;

    private String name;

    private int numOfEatenCones = 0;

    private boolean hungry;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfEatenCones() {
        return numOfEatenCones;
    }

    public void setNumOfEatenCones(int numOfEatenCones) {
        this.numOfEatenCones = numOfEatenCones;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
