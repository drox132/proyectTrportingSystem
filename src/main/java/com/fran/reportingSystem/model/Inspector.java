package com.fran.reportingSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Inspector {

    @Id
    private long id;
    private String name;
    @Column(name = "startdate")
    private Date startDate;
    private String phone;
    private String email;

    public Inspector() {
    }

    public Inspector(long id, String name, Date startDate, String phone, String email) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.phone = phone;
        this.email = email;
    }

    public Inspector(String name, Date startDate, String phone, String email) {
        this.name = name;
        this.startDate = startDate;
        this.phone = phone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
