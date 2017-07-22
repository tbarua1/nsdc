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
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
private String studentCode,name,buidingNo,streetNo,locality,city,district,territory,phone,whatsapp,ssc,jobrole,qpcode;

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", studentCode=" + studentCode + ", name=" + name + ", buidingNo=" + buidingNo + ", streetNo=" + streetNo + ", locality=" + locality + ", city=" + city + ", district=" + district + ", territory=" + territory + ", phone=" + phone + ", whatsapp=" + whatsapp + ", ssc=" + ssc + ", jobrole=" + jobrole + ", qpcode=" + qpcode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.studentCode);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.buidingNo);
        hash = 79 * hash + Objects.hashCode(this.streetNo);
        hash = 79 * hash + Objects.hashCode(this.locality);
        hash = 79 * hash + Objects.hashCode(this.city);
        hash = 79 * hash + Objects.hashCode(this.district);
        hash = 79 * hash + Objects.hashCode(this.territory);
        hash = 79 * hash + Objects.hashCode(this.phone);
        hash = 79 * hash + Objects.hashCode(this.whatsapp);
        hash = 79 * hash + Objects.hashCode(this.ssc);
        hash = 79 * hash + Objects.hashCode(this.jobrole);
        hash = 79 * hash + Objects.hashCode(this.qpcode);
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
        final Students other = (Students) obj;
        if (!Objects.equals(this.studentCode, other.studentCode)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.buidingNo, other.buidingNo)) {
            return false;
        }
        if (!Objects.equals(this.streetNo, other.streetNo)) {
            return false;
        }
        if (!Objects.equals(this.locality, other.locality)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.district, other.district)) {
            return false;
        }
        if (!Objects.equals(this.territory, other.territory)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.whatsapp, other.whatsapp)) {
            return false;
        }
        if (!Objects.equals(this.ssc, other.ssc)) {
            return false;
        }
        if (!Objects.equals(this.jobrole, other.jobrole)) {
            return false;
        }
        if (!Objects.equals(this.qpcode, other.qpcode)) {
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

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuidingNo() {
        return buidingNo;
    }

    public void setBuidingNo(String buidingNo) {
        this.buidingNo = buidingNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    public String getQpcode() {
        return qpcode;
    }

    public void setQpcode(String qpcode) {
        this.qpcode = qpcode;
    }

}
