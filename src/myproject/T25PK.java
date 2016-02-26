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
public class T25PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "emp_id")
    private String empId;
    @Basic(optional = false)
    @Column(name = "salary")
    private int salary;

    public T25PK() {
    }

    public T25PK(String empId, int salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        hash += (int) salary;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T25PK)) {
            return false;
        }
        T25PK other = (T25PK) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myproject.T25PK[ empId=" + empId + ", salary=" + salary + " ]";
    }
    
}
