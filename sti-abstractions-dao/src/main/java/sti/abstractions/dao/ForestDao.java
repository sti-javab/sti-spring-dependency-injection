package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

public interface ForestDao {

    Squirrel createSquirrel(int age, String name, int numOfEatenCones, boolean hungry);
    PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl);

}
