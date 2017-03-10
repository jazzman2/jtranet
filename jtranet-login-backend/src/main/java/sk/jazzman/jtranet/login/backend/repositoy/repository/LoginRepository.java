package sk.jazzman.jtranet.login.backend.repositoy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import sk.jazzman.jtranet.domain.login.Login;

/**
 * Created by jano on 3/9/17.
 */
public interface LoginRepository extends PagingAndSortingRepository<Login,Long> {
    Login findByLogin(String login);
}
