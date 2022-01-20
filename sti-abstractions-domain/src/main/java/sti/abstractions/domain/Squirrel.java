package sti.abstractions.domain;

public class Squirrel extends Animal{

    private int age;

    private String name;

    private int numOfEatenCones = 0;

    public Squirrel(int age, String name, boolean hungry){
        super(hungry);
        this.age = age;
        this.name = name;
    }

    public Squirrel(int age, String name, int numOfEatenCones, boolean hungry) {
        super(hungry);
        this.age = age;
        this.name = name;
        this.numOfEatenCones = numOfEatenCones;
    }

    @Override
    boolean eat(Object cone) {
        if(cone instanceof PineTree.PineCone){
            numOfEatenCones++;
            return true;
        }
        return false;
    }

}
