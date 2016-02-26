/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author MEENA
 */
@Embeddable
public class T11PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "cust_name")
    private String custName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public T11PK() {
    }

    public T11PK(String custName, String email) {
        this.custName = custName;
        this.email = email;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custName != null ? custName.hashCode() : 0);
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T11PK)) {
            return false;
        }
        T11PK other = (T11PK) object;
        if ((this.custName == null && other.custName != null) || (this.custName != null && !this.custName.equals(other.custName))) {
            return false;
        }
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T11PK[ custName=" + custName + ", email=" + email + " ]";
    }
    
}
