package sk.jazzman.jtranet.login.backend.repositoy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sk.jazzman.jtranet.domain.BaseEntityAbt;

/**
 * Created by jano on 3/10/17.
 */
@Configuration
@EnableJpaRepositories(repositoryBaseClass = BaseEntityAbt.class)
public class RepositoryConfiguration  {
}
