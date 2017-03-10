package sk.jazzman.jtranet.domain.login;

import sk.jazzman.jtranet.domain.BaseEntityAbt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
@Entity
@Table(name = "login")
public class Login extends BaseEntityAbt {
    private final String login;
    private final String password;

    /**
     * {@link java.lang.reflect.Constructor}
     *
     * @param login
     * @param password
     */
    public Login(Long id, Long createdBy, Timestamp createdOn,String login, String password){
        super(id,createdBy,createdOn);
        this.login = login;
        this.password = password;
    }

    @Column(name = "login", length = 25, nullable = false)
    public String getLogin() {
        return login;
    }

    @Column(name = "password", length = 25)
    public String getPassword() {
        return password;
    }


}
