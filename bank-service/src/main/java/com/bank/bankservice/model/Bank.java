package com.bank.bankservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("banks")
public class Bank {
    @Id
    private Long id;

    private String name;
    private String address;
    private String nit;

    public Bank() {
    }

    public Bank(Long id, String name, String address, String nit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nit = nit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNit() {
        return nit;
    }
}
