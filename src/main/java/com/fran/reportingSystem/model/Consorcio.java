package com.fran.reportingSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consorcio {
    @Id
    private long id;
    private String name;
    private String cuit;
    private String cbu;
    private String email;
    @Column(name = "idinspector")
    private Long idInspector;
    @Column(name = "idbank")
    private int idBank;


    public Consorcio() {
    }

    public Consorcio(long id, String name, String cuit, String cbu, String email, Long idInspector, int idBank) {
        this.id = id;
        this.name = name;
        this.cuit = cuit;
        this.cbu = cbu;
        this.email = email;
        this.idInspector = idInspector;
        this.idBank = idBank;
    }

    public Consorcio(String name, String cuit, String cbu, String email, Long idInspector, int idBank) {
        this.name = name;
        this.cuit = cuit;
        this.cbu = cbu;
        this.email = email;
        this.idInspector = idInspector;
        this.idBank = idBank;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(Long idInspector) {
        this.idInspector = idInspector;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }
}
