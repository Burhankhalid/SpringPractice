package com.masterclass.masterclass.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CardHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String name;
    private String address;
    private String code;

    public CardHolder(Long ID, String name, String address, String code) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.code = code;
    }
    public CardHolder() {
    }

    public Long getID() {
        return ID;
    }


    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CardHolder{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
