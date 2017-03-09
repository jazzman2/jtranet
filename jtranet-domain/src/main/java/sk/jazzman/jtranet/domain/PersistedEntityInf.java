package sk.jazzman.jtranet.domain;

import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
public interface PersistedEntityInf {
    Long getId();

    Timestamp createdOn();

    Long createdBy();
}
