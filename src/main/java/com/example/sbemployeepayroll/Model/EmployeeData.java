package com.example.sbemployeepayroll.Model;

import javax.persistence.*;

@Entity
public class EmployeeData {

    String firstName;
    String lastName;
    String department;
    String gender;
    String message;
    Long salary;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    public EmployeeData() {
    }

    public EmployeeData(EmployeeData employeeData) {
        this.firstName = employeeData.firstName;
        this.lastName = employeeData.lastName;
        this.department = employeeData.department;
        this.gender = employeeData.gender;
        this.message = employeeData.message;
        this.salary = employeeData.salary;
        this.id = id;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
