package sk.jazzman.jtranet.domain.login;

import sk.jazzman.jtranet.domain.BaseEntityBuilderAbt;

/**
 * Created by jano on 3/9/17.
 */
public class LoginBuilder extends BaseEntityBuilderAbt {
    private String login;

    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Login build() {
        return new Login(id,createdBy,createdOn,login,password);
    }
}
