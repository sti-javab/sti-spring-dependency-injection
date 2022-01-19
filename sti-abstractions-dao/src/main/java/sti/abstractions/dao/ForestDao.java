package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.Connection;
import java.sql.SQLException;

public interface ForestDao {

    Squirrel createSquirrel(int age, String name, int numOfEatenCones, boolean hungry);
    PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl);

    Connection getConnection() throws SQLException;
}
