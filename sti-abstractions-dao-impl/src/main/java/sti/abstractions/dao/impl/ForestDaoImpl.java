package sti.abstractions.dao.impl;

import sti.abstractions.dao.ForestDao;
import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.*;

public class ForestDaoImpl implements ForestDao {

    Connection conn = null;
    PreparedStatement preparedStatement = null;
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
            preparedStatement =conn.prepareStatement("INSERT INTO squirrel ( age, name) VALUES(default , ?, ?)");

            preparedStatement.setInt(1, age);
            preparedStatement.setString(2, name);

            result = preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        return new Squirrel(age, name, numOfEatenCones, hungry);
    }

    @Override
    public Squirrel createSquirrel(int age, String name) {
        try{
            conn = getConnection();
            preparedStatement =conn.prepareStatement("INSERT INTO squirrel ( age, name) VALUES( ?, ?)");

            preparedStatement.setInt(1, age);
            preparedStatement.setString(2, name);

            result = preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        return new Squirrel(age, name);
    }

    @Override
    public PineTree createPineTree(int numOfPineCones, int numOfSquirrels, Owl owl) {
        return null;
    }
}
