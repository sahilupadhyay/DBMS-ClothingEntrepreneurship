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
@Table(name = "t4", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T4.findAll", query = "SELECT t FROM T4 t"),
    @NamedQuery(name = "T4.findByRawId", query = "SELECT t FROM T4 t WHERE t.rawId = :rawId"),
    @NamedQuery(name = "T4.findByQuality", query = "SELECT t FROM T4 t WHERE t.quality = :quality"),
    @NamedQuery(name = "T4.findByPrice", query = "SELECT t FROM T4 t WHERE t.price = :price"),
    @NamedQuery(name = "T4.findByQuantity", query = "SELECT t FROM T4 t WHERE t.quantity = :quantity")})
public class T4 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "raw_id")
    private String rawId;
    @Column(name = "quality")
    private String quality;
    @Column(name = "price")
    private Integer price;
    @Column(name = "quantity")
    private Integer quantity;

    public T4() {
    }

    public T4(String rawId) {
        this.rawId = rawId;
    }

    public String getRawId() {
        return rawId;
    }

    public void setRawId(String rawId) {
        String oldRawId = this.rawId;
        this.rawId = rawId;
        changeSupport.firePropertyChange("rawId", oldRawId, rawId);
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        String oldQuality = this.quality;
        this.quality = quality;
        changeSupport.firePropertyChange("quality", oldQuality, quality);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        Integer oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rawId != null ? rawId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T4)) {
            return false;
        }
        T4 other = (T4) object;
        if ((this.rawId == null && other.rawId != null) || (this.rawId != null && !this.rawId.equals(other.rawId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T4[ rawId=" + rawId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
