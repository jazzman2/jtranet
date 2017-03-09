package sk.jazzman.jtranet.domain;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
public class BaseEntity implements BaseEntityInf {
    private final Long id;

    private final Long createdBy;
    private final Timestamp createdOn;

    private final Long modifiedBy;
    private final Timestamp modifiedOn;

    /**
     * {@link java.lang.reflect.Constructor}
     *
     * @param id
     * @param createdBy
     * @param createdOn
     * @param modifiedBy
     * @param modifiedOn
     */
    public BaseEntity(Long id, Long createdBy, Timestamp createdOn,Long modifiedBy, Timestamp modifiedOn){
        this.id = id;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
    }

    public Long getId() {
        return id;
    }

    public Timestamp createdOn() {
        return createdOn;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public Long createdBy() {
        return createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }
}
