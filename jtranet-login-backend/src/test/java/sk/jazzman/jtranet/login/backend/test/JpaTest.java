package sk.jazzman.jtranet.login.backend.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import sk.jazzman.jtranet.domain.login.Login;
import sk.jazzman.jtranet.domain.login.LoginBuilder;
import sk.jazzman.jtranet.login.backend.repositoy.repository.LoginRepository;

import java.sql.Timestamp;

/**
 * Created by jano on 3/10/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private LoginRepository repository;

    @Test
    public void testExample() throws Exception {
        this.entityManager.persist(new Login(Long.valueOf(1),Long.valueOf(2),new Timestamp(123456),"test","test"));

        Login login = this.repository.findByLogin("test");
        Assert.assertEquals(login.getId().longValue(),Long.valueOf(1).longValue());
    }

}
