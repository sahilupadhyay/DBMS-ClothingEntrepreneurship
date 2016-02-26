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
@Table(name = "t12", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T12.findAll", query = "SELECT t FROM T12 t"),
    @NamedQuery(name = "T12.findByCustId", query = "SELECT t FROM T12 t WHERE t.custId = :custId"),
    @NamedQuery(name = "T12.findByPaymentMode", query = "SELECT t FROM T12 t WHERE t.paymentMode = :paymentMode"),
    @NamedQuery(name = "T12.findByEmail", query = "SELECT t FROM T12 t WHERE t.email = :email"),
    @NamedQuery(name = "T12.findByCustName", query = "SELECT t FROM T12 t WHERE t.custName = :custName"),
    @NamedQuery(name = "T12.findByTotal", query = "SELECT t FROM T12 t WHERE t.total = :total")})
public class T12 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cust_id")
    private String custId;
    @Column(name = "payment_mode")
    private String paymentMode;
    @Column(name = "email")
    private String email;
    @Column(name = "cust_name")
    private String custName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Float total;

    public T12() {
    }

    public T12(String custId) {
        this.custId = custId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        String oldCustId = this.custId;
        this.custId = custId;
        changeSupport.firePropertyChange("custId", oldCustId, custId);
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        String oldPaymentMode = this.paymentMode;
        this.paymentMode = paymentMode;
        changeSupport.firePropertyChange("paymentMode", oldPaymentMode, paymentMode);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        String oldCustName = this.custName;
        this.custName = custName;
        changeSupport.firePropertyChange("custName", oldCustName, custName);
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        Float oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T12)) {
            return false;
        }
        T12 other = (T12) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T12[ custId=" + custId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
