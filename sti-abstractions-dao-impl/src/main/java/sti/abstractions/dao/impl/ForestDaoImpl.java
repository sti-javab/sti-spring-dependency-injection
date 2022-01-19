package sti.abstractions.dao.impl;

import sti.abstractions.dao.ForestDao;
import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.*;
import java.util.Properties;

public class ForestDaoImpl implements ForestDao {

    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;

    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sti", "root", "root");
    }


    @Override
    public Squirrel createSquirrel(int age, String name, int numOfEatenCones, boolean hungry) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl) {
        return null;
    }
}
