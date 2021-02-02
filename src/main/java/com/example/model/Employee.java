package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column
    private Integer Empid;
    @Column
    private String Empname;
    public Employee() {}

    public Employee(Integer Empid,String Empname) {
        this.Empid = Empid;
        this.Empname = Empname;
    }
    public Integer getEmpid() {
        return Empid;
    }

    public void setEmpid(Integer empid) {
        Empid = empid;
    }

    public String getEmpname() {
        return Empname;
    }

    public void setEmpname(String empname) {
        Empname = empname;
    }
    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (o == null || getClass() != o.getClass()) {
            result = false;
        } else {
            Employee employee = (Employee) o;
            result = Objects.equals(Empid, employee.Empid) &&
                    Objects.equals(Empname, employee.Empname);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Empid, Empname);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("Empid =").append(Empid);
        sb.append(", Name ='").append(Empname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
