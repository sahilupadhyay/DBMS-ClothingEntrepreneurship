/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MEENA
 */
@Entity
@Table(name = "t11", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T11.findAll", query = "SELECT t FROM T11 t"),
    @NamedQuery(name = "T11.findByCustName", query = "SELECT t FROM T11 t WHERE t.t11PK.custName = :custName"),
    @NamedQuery(name = "T11.findByEmail", query = "SELECT t FROM T11 t WHERE t.t11PK.email = :email"),
    @NamedQuery(name = "T11.findByComment", query = "SELECT t FROM T11 t WHERE t.comment = :comment"),
    @NamedQuery(name = "T11.findByCustId", query = "SELECT t FROM T11 t WHERE t.custId = :custId")})
public class T11 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T11PK t11PK;
    @Column(name = "comment")
    private String comment;
    @Column(name = "cust_id")
    private String custId;

    public T11() {
    }

    public T11(T11PK t11PK) {
        this.t11PK = t11PK;
    }

    public T11(String custName, String email) {
        this.t11PK = new T11PK(custName, email);
    }

    public T11PK getT11PK() {
        return t11PK;
    }

    public void setT11PK(T11PK t11PK) {
        this.t11PK = t11PK;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        String oldComment = this.comment;
        this.comment = comment;
        changeSupport.firePropertyChange("comment", oldComment, comment);
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        String oldCustId = this.custId;
        this.custId = custId;
        changeSupport.firePropertyChange("custId", oldCustId, custId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t11PK != null ? t11PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T11)) {
            return false;
        }
        T11 other = (T11) object;
        if ((this.t11PK == null && other.t11PK != null) || (this.t11PK != null && !this.t11PK.equals(other.t11PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T11[ t11PK=" + t11PK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
