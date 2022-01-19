package sti.abstractions.dao.impl;

import sti.abstractions.dao.ForestDao;
import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.*;

public class ForestDaoImpl implements ForestDao {

    @Override
    public Squirrel createSquirrel(int age, String name, int numOfEatenCones, boolean hungry) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl) {
        return null;
    }
}
