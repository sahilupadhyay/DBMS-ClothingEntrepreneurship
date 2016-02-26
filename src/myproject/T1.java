/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MEENA
 */
@Entity
@Table(name = "t1", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T1.findAll", query = "SELECT t FROM T1 t"),
    @NamedQuery(name = "T1.findByFacId", query = "SELECT t FROM T1 t WHERE t.facId = :facId"),
    @NamedQuery(name = "T1.findByOwner", query = "SELECT t FROM T1 t WHERE t.owner = :owner"),
    @NamedQuery(name = "T1.findByFacName", query = "SELECT t FROM T1 t WHERE t.facName = :facName"),
    @NamedQuery(name = "T1.findByNoOfWorkers", query = "SELECT t FROM T1 t WHERE t.noOfWorkers = :noOfWorkers"),
    @NamedQuery(name = "T1.findByAddress", query = "SELECT t FROM T1 t WHERE t.address = :address"),
    @NamedQuery(name = "T1.findByFacCapacity", query = "SELECT t FROM T1 t WHERE t.facCapacity = :facCapacity")})
public class T1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fac_id")
    private String facId;
    @Column(name = "owner")
    private String owner;
    @Column(name = "fac_name")
    private String facName;
    @Column(name = "no_of_workers")
    private Integer noOfWorkers;
    @Column(name = "address")
    private String address;
    @Column(name = "fac_capacity")
    private Integer facCapacity;

    public T1() {
    }

    public T1(String facId) {
        this.facId = facId;
    }

    public String getFacId() {
        return facId;
    }

    public void setFacId(String facId) {
        String oldFacId = this.facId;
        this.facId = facId;
        changeSupport.firePropertyChange("facId", oldFacId, facId);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        String oldOwner = this.owner;
        this.owner = owner;
        changeSupport.firePropertyChange("owner", oldOwner, owner);
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        String oldFacName = this.facName;
        this.facName = facName;
        changeSupport.firePropertyChange("facName", oldFacName, facName);
    }

    public Integer getNoOfWorkers() {
        return noOfWorkers;
    }

    public void setNoOfWorkers(Integer noOfWorkers) {
        Integer oldNoOfWorkers = this.noOfWorkers;
        this.noOfWorkers = noOfWorkers;
        changeSupport.firePropertyChange("noOfWorkers", oldNoOfWorkers, noOfWorkers);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Integer getFacCapacity() {
        return facCapacity;
    }

    public void setFacCapacity(Integer facCapacity) {
        Integer oldFacCapacity = this.facCapacity;
        this.facCapacity = facCapacity;
        changeSupport.firePropertyChange("facCapacity", oldFacCapacity, facCapacity);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facId != null ? facId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T1)) {
            return false;
        }
        T1 other = (T1) object;
        if ((this.facId == null && other.facId != null) || (this.facId != null && !this.facId.equals(other.facId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T1[ facId=" + facId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
