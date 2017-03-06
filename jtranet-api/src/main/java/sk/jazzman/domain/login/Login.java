package sk.jazzman.domain.login;

/**
 * Implementation of {@link LoginInf}
 *
 * @author Jan Kovalcik
 * @since v0.0.1
 */
public class Login implements LoginInf {
    private String login;
    private String password;

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
