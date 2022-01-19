package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.domain.Owl;
import sti.abstractions.service.ForestService;

public class TestService {

    private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
            "classpath:sti-abstractions-service.xml", "classpath:sti-abstractions-dao.xml");

    private ForestService forestService;

    private ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Before
    public void before() {
        forestService = (ForestService) getApplicationContext().getBean("forestService");
    }

    @Test
    public void testDependencyInjection(){
        Owl owl = forestService.createOwl(90);
        Assert.assertNotNull(owl);
    }

}
