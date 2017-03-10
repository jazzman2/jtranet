package sk.jazzman.jtranet.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by jano on 3/9/17.
 */
@MappedSuperclass
public abstract class BaseEntityAbt implements PersistedEntityInf, Serializable{
    private final Long id;

    private final Long createdBy;
    private final Timestamp createdOn;

    /**
     * {@link java.lang.reflect.Constructor}
     *
     * @param id
     * @param createdBy
     * @param createdOn
     */
    public BaseEntityAbt(Long id, Long createdBy, Timestamp createdOn){
        this.id = id;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @CreationTimestamp
    @Column(name = "created_on", nullable = false)
    public Timestamp createdOn() {
        return createdOn;
    }

    @Column(name = "created_by")
    public Long createdBy() {
        return createdBy;
    }

}
