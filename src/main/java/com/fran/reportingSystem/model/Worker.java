package com.fran.reportingSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Worker {

    @Id
    private Long id;

    private String name;

    private String cuil;

    private String cbu;

    private String phone;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "idconsorcio")
    private Long idConsorcio;

    @Column(name = "idbank")
    private int idBank;

    public Worker() {
    }

    public Worker(Long id, String name, String cuil, String cbu, String phone, Date startDate, Long idConsorcio, int idBank) {
        this.id = id;
        this.name = name;
        this.cuil = cuil;
        this.cbu = cbu;
        this.phone = phone;
        this.startDate = startDate;
        this.idConsorcio = idConsorcio;
        this.idBank =idBank;
    }

    public Worker(String name, String cuil, String cbu, String phone, Date startDate, Long idConsorcio, int idBank) {
        this.name = name;
        this.cuil = cuil;
        this.cbu = cbu;
        this.phone = phone;
        this.startDate = startDate;
        this.idConsorcio = idConsorcio;
        this.idBank = idBank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getIdConsorcio() {
        return idConsorcio;
    }

    public void setIdConsorcio(Long idConsorcio) {
        this.idConsorcio = idConsorcio;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }
}
