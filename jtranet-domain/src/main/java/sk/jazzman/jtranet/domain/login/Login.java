package sk.jazzman.jtranet.domain.login;

import sk.jazzman.jtranet.domain.BaseEntity;

import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
public class Login extends BaseEntity {
    private final String login;
    private final String password;

    /**
     * {@link java.lang.reflect.Constructor}
     *
     * @param login
     * @param password
     */
    public Login(Long id, Long createdBy, Timestamp createdOn, Long modifiedBy, Timestamp modifiedOn,String login, String password){
        super(id,createdBy,createdOn,modifiedBy,modifiedOn);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }


}
