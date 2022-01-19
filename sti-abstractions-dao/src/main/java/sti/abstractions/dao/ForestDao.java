package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;

public interface ForestDao {

    PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl);

}
