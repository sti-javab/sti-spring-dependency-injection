package sti.abstractions.dao.impl;

import sti.abstractions.dao.ForestDao;
import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.*;

public class ForestDaoImpl implements ForestDao {

    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;
    int result = 0;

    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sti", "root", "root");
    }

    @Override
    public Squirrel createSquirrel(int age, String name, int numOfEatenCones, boolean hungry)  {

        try{
            conn = getConnection();
            stat =conn.prepareStatement("INSERT INTO squirrel ( age, name, numOfeatencones, hungry) VALUES(3, 'Piff', 10, false)");
            result = stat.executeUpdate("INSERT INTO squirrel ( age, name, numOfeatencones, hungry) VALUES(3, 'Piff', 10, false)");
        }catch (SQLException e){
            System.out.println(e);
        }
        return new Squirrel(age, name, numOfEatenCones, hungry);
    }

    @Override
    public PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl) {
        return null;
    }
}
