package sk.jazzman.jtranet.domain;

import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
public class BaseEntityBuilder {
    protected Long id;

    protected Long createdBy;
    protected Timestamp createdOn;

    protected Long modifiedBy;
    protected Timestamp modifiedOn;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public BaseEntity build(){
        return new BaseEntity(id,createdBy,createdOn,modifiedBy,modifiedOn);
    }
}
