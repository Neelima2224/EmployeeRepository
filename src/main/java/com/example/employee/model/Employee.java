package com.example.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Employeedetils")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Employee_id")
    private long Id;
    @Column(name="First_name")
    private String  Firstname;
    @Column(name="Middle_name")
    private String Middlename;
    @Column(name="Last_name")
    private String Lastname;
    @Column(name="Email_Id")
    private String Emailid;
    @Column(name="Phonenumber")
    private long Phnno ;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public void setMiddlename(String middlename) {
        Middlename = middlename;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public long getPhnno() {
        return Phnno;
    }

    public void setPhnno(long phnno) {
        Phnno = phnno;
    }


    }

