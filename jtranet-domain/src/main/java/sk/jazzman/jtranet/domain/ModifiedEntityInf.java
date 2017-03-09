package sk.jazzman.jtranet.domain;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
public interface ModifiedEntityInf {
    Long getId();

    Timestamp getModifiedOn();

    Long getModifiedBy();
}
