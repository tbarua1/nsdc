/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Abhishek.Sehgal
 */
@Entity
public class TrainingPartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, spocName, spocNumber, tp_smart_id,username,password,usertype;   
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
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

    public String getSpocName() {
        return spocName;
    }

    public void setSpocName(String spocName) {
        this.spocName = spocName;
    }

    public String getSpocNumber() {
        return spocNumber;
    }

    public void setSpocNumber(String spocNumber) {
        this.spocNumber = spocNumber;
    }

    public String getTp_smart_id() {
        return tp_smart_id;
    }

    public void setTp_smart_id(String tp_smart_id) {
        this.tp_smart_id = tp_smart_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.spocName);
        hash = 53 * hash + Objects.hashCode(this.spocNumber);
        hash = 53 * hash + Objects.hashCode(this.tp_smart_id);
        hash = 53 * hash + Objects.hashCode(this.address);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrainingPartner other = (TrainingPartner) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.spocName, other.spocName)) {
            return false;
        }
        if (!Objects.equals(this.spocNumber, other.spocNumber)) {
            return false;
        }
        if (!Objects.equals(this.tp_smart_id, other.tp_smart_id)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrainingPartner{" + "id=" + id + ", name=" + name + ", spocName=" + spocName + ", spocNumber=" + spocNumber + ", tp_smart_id=" + tp_smart_id + ", address=" + address + '}';
    }
    
}
