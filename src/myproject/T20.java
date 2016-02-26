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
@Table(name = "t20", catalog = "project2014", schema = "")
@NamedQueries({
    @NamedQuery(name = "T20.findAll", query = "SELECT t FROM T20 t"),
    @NamedQuery(name = "T20.findByEmpId", query = "SELECT t FROM T20 t WHERE t.empId = :empId"),
    @NamedQuery(name = "T20.findByEmpName", query = "SELECT t FROM T20 t WHERE t.empName = :empName"),
    @NamedQuery(name = "T20.findByAddress", query = "SELECT t FROM T20 t WHERE t.address = :address"),
    @NamedQuery(name = "T20.findBySalary", query = "SELECT t FROM T20 t WHERE t.salary = :salary"),
    @NamedQuery(name = "T20.findByAge", query = "SELECT t FROM T20 t WHERE t.age = :age"),
    @NamedQuery(name = "T20.findByDepId", query = "SELECT t FROM T20 t WHERE t.depId = :depId")})
public class T20 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_id")
    private String empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "address")
    private String address;
    @Column(name = "salary")
    private Integer salary;
    @Column(name = "age")
    private Integer age;
    @Column(name = "dep_id")
    private String depId;

    public T20() {
    }

    public T20(String empId) {
        this.empId = empId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        String oldEmpId = this.empId;
        this.empId = empId;
        changeSupport.firePropertyChange("empId", oldEmpId, empId);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        String oldEmpName = this.empName;
        this.empName = empName;
        changeSupport.firePropertyChange("empName", oldEmpName, empName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        Integer oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Integer oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        String oldDepId = this.depId;
        this.depId = depId;
        changeSupport.firePropertyChange("depId", oldDepId, depId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T20)) {
            return false;
        }
        T20 other = (T20) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T20[ empId=" + empId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
