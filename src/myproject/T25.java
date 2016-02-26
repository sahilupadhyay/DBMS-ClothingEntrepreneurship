/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "t25", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T25.findAll", query = "SELECT t FROM T25 t"),
    @NamedQuery(name = "T25.findByEmpId", query = "SELECT t FROM T25 t WHERE t.t25PK.empId = :empId"),
    @NamedQuery(name = "T25.findBySalary", query = "SELECT t FROM T25 t WHERE t.t25PK.salary = :salary")})
public class T25 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T25PK t25PK;

    public T25() {
    }

    public T25(T25PK t25PK) {
        this.t25PK = t25PK;
    }

    public T25(String empId, int salary) {
        this.t25PK = new T25PK(empId, salary);
    }

    public T25PK getT25PK() {
        return t25PK;
    }

    public void setT25PK(T25PK t25PK) {
        this.t25PK = t25PK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t25PK != null ? t25PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T25)) {
            return false;
        }
        T25 other = (T25) object;
        if ((this.t25PK == null && other.t25PK != null) || (this.t25PK != null && !this.t25PK.equals(other.t25PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T25[ t25PK=" + t25PK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
