package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.dao.ForestDao;
import sti.abstractions.service.ForestService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class TestDao {

    private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
            "classpath:sti-abstractions-dao.xml");

    private ForestDao forestDao;

    private ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Before
    public void before() {
        forestDao = (ForestDao) getApplicationContext().getBean("forestDao");
    }

    @Test
    public void testDaoGetConnection(){
        Connection connection = null;
        try {
            connection = forestDao.getConnection();
        }catch (SQLException e){
            System.out.println(e);
        }
        Assert.assertNotNull(connection);
    }
}
