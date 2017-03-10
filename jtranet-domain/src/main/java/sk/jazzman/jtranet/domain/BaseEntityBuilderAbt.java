package sk.jazzman.jtranet.domain;

import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
public abstract class BaseEntityBuilderAbt {
    protected Long id;

    protected Long createdBy;
    protected Timestamp createdOn;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public abstract BaseEntityAbt build();
}
