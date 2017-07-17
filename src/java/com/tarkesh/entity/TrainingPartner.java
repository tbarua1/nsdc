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
    private String name, spocName, spocNumber, tp_smart_id,username,password,usertype,mobile,whatsapp,
            skype,email,building,locality,city,state,district,pin,tpsmartid;   
    //private Address address;

    public String getTpsmartid() {
        return tpsmartid;
    }

    public void setTpsmartid(String tpsmartid) {
        this.tpsmartid = tpsmartid;
    }

    @Override
    public String toString() {
        return "TrainingPartner{" + "id=" + id + ", name=" + name + ", spocName=" + spocName + ", spocNumber=" + spocNumber + ", tp_smart_id=" + tp_smart_id + ", username=" + username + ", password=" + password + ", usertype=" + usertype + ", mobile=" + mobile + ", whatsapp=" + whatsapp + ", skype=" + skype + ", email=" + email + ", building=" + building + ", locality=" + locality + ", city=" + city + ", state=" + state + ", district=" + district + ", pin=" + pin + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.spocName);
        hash = 83 * hash + Objects.hashCode(this.spocNumber);
        hash = 83 * hash + Objects.hashCode(this.tp_smart_id);
        hash = 83 * hash + Objects.hashCode(this.username);
        hash = 83 * hash + Objects.hashCode(this.password);
        hash = 83 * hash + Objects.hashCode(this.usertype);
        hash = 83 * hash + Objects.hashCode(this.mobile);
        hash = 83 * hash + Objects.hashCode(this.whatsapp);
        hash = 83 * hash + Objects.hashCode(this.skype);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.building);
        hash = 83 * hash + Objects.hashCode(this.locality);
        hash = 83 * hash + Objects.hashCode(this.city);
        hash = 83 * hash + Objects.hashCode(this.state);
        hash = 83 * hash + Objects.hashCode(this.district);
        hash = 83 * hash + Objects.hashCode(this.pin);
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
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.usertype, other.usertype)) {
            return false;
        }
        if (!Objects.equals(this.mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(this.whatsapp, other.whatsapp)) {
            return false;
        }
        if (!Objects.equals(this.skype, other.skype)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.building, other.building)) {
            return false;
        }
        if (!Objects.equals(this.locality, other.locality)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.district, other.district)) {
            return false;
        }
        if (!Objects.equals(this.pin, other.pin)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
}
