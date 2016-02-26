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
@Table(name = "t17", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T17.findAll", query = "SELECT t FROM T17 t"),
    @NamedQuery(name = "T17.findByClothId", query = "SELECT t FROM T17 t WHERE t.clothId = :clothId"),
    @NamedQuery(name = "T17.findByPrize", query = "SELECT t FROM T17 t WHERE t.prize = :prize"),
    @NamedQuery(name = "T17.findByMaterial", query = "SELECT t FROM T17 t WHERE t.material = :material")})
public class T17 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cloth_id")
    private String clothId;
    @Column(name = "prize")
    private Integer prize;
    @Column(name = "material")
    private String material;

    public T17() {
    }

    public T17(String clothId) {
        this.clothId = clothId;
    }

    public String getClothId() {
        return clothId;
    }

    public void setClothId(String clothId) {
        String oldClothId = this.clothId;
        this.clothId = clothId;
        changeSupport.firePropertyChange("clothId", oldClothId, clothId);
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        Integer oldPrize = this.prize;
        this.prize = prize;
        changeSupport.firePropertyChange("prize", oldPrize, prize);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        String oldMaterial = this.material;
        this.material = material;
        changeSupport.firePropertyChange("material", oldMaterial, material);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clothId != null ? clothId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T17)) {
            return false;
        }
        T17 other = (T17) object;
        if ((this.clothId == null && other.clothId != null) || (this.clothId != null && !this.clothId.equals(other.clothId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T17[ clothId=" + clothId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
