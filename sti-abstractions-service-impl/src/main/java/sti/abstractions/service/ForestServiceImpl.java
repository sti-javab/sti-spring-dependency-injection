package sti.abstractions.service;

import sti.abstractions.dao.ForestDao;
import sti.abstractions.dao.impl.ForestDaoImpl;
import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.util.Objects;

public class ForestServiceImpl implements ForestService{

    private ForestDao forestDao;

    public ForestServiceImpl(ForestDaoImpl forestDao){
        //Javas egen metod för null check
        this.forestDao = Objects.requireNonNull(forestDao);
    }

    public Owl createOwl(int wingSpan){
        Owl owl = new Owl(wingSpan);
        return owl;
    }

    @Override
    public Squirrel createSquirrel(int age, String name) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfPineCones) {
        return new PineTree(numOfPineCones);
    }

    @Override
    public PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl) {
        return new PineTree(numOfPineCones, numOfSquirrels, owl);
    }

    public Boolean killOwl(Owl owl){return null;}

}
