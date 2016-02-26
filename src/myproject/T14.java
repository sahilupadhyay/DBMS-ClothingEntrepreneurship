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
@Table(name = "t14", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T14.findAll", query = "SELECT t FROM T14 t"),
    @NamedQuery(name = "T14.findByShowId", query = "SELECT t FROM T14 t WHERE t.showId = :showId"),
    @NamedQuery(name = "T14.findByAddress", query = "SELECT t FROM T14 t WHERE t.address = :address"),
    @NamedQuery(name = "T14.findByNoOfWorkers", query = "SELECT t FROM T14 t WHERE t.noOfWorkers = :noOfWorkers"),
    @NamedQuery(name = "T14.findByName", query = "SELECT t FROM T14 t WHERE t.name = :name"),
    @NamedQuery(name = "T14.findByQuantity", query = "SELECT t FROM T14 t WHERE t.quantity = :quantity")})
public class T14 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "show_id")
    private String showId;
    @Column(name = "address")
    private String address;
    @Column(name = "no_of_workers")
    private Integer noOfWorkers;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private String quantity;

    public T14() {
    }

    public T14(String showId) {
        this.showId = showId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        String oldShowId = this.showId;
        this.showId = showId;
        changeSupport.firePropertyChange("showId", oldShowId, showId);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Integer getNoOfWorkers() {
        return noOfWorkers;
    }

    public void setNoOfWorkers(Integer noOfWorkers) {
        Integer oldNoOfWorkers = this.noOfWorkers;
        this.noOfWorkers = noOfWorkers;
        changeSupport.firePropertyChange("noOfWorkers", oldNoOfWorkers, noOfWorkers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        String oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (showId != null ? showId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T14)) {
            return false;
        }
        T14 other = (T14) object;
        if ((this.showId == null && other.showId != null) || (this.showId != null && !this.showId.equals(other.showId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T14[ showId=" + showId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
