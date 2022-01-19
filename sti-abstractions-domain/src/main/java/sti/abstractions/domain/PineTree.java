package sti.abstractions.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PineTree extends Tree {

    List<PineCone> pineCones = new ArrayList<>();

    List<Squirrel> squirrels = new ArrayList<>();

    Owl owl;

    public PineTree(int numOfPineCones) {

        //@TODO: replace with Java 8 stream
        while (numOfPineCones > 0) {
            pineCones.add(new PineCone());
            numOfPineCones--;
        }
    }

    public PineTree(int numOfPineCones, int numOfSquirrels, Owl owl) {
        while (numOfPineCones > 0) {
            pineCones.add(new PineCone());
            numOfPineCones--;
        }

        //@TODO: no check if arguments are valid. e.g. numOfSquirrels might be a negative value
        while (numOfSquirrels > 0) {
            pineCones.add(new PineCone());
            numOfSquirrels--;
        }

        //@TODO: no check if arguments are valid. e.g. Owl can be null
        this.owl = owl;

    }

    static class PineCone {

        int calories;

        PineCone() {
            calories = Integer.parseInt(Math.round(Math.random() * 10) + "");
        }

    }

}
