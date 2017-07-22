package com.tarkesh.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tarkeshwar
 */
@Entity
//@XmlRootElement
public class TrainingCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name,nameSPOC, contactSPOC,buildingNo, 
            streetNo, locality, city, district, state, username, password, 
            usertype,creator,jobrole,ssc,qpcode,tpsmartid;
    private Integer pin;
    @Temporal(TemporalType.TIMESTAMP)
    private Date rdate;   
    private double latitude, longitude;

    public String getTpsmartid() {
        return tpsmartid;
    }

    public void setTpsmartid(String tpsmartid) {
        this.tpsmartid = tpsmartid;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public String getQpcode() {
        return qpcode;
    }

    public void setQpcode(String qpcode) {
        this.qpcode = qpcode;
    }

    @Override
    public String toString() {
        return "TrainingCenter{" + "id=" + id + ", name=" + name + ", university_type=, nameSPOC=" + nameSPOC + ", contactSPOC=" + contactSPOC + ", buildingNo=" + buildingNo + ", streetNo=" + streetNo + ", locality=" + locality + ", city=" + city + ", district=" + district + ", state=" + state + ", username=" + username + ", password=" + password + ", usertype=" + usertype + ", creator=" + creator + ", jobrole=" + jobrole + ", pin=" + pin + ", rdate=" + rdate + ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.nameSPOC);
        hash = 41 * hash + Objects.hashCode(this.contactSPOC);
        hash = 41 * hash + Objects.hashCode(this.buildingNo);
        hash = 41 * hash + Objects.hashCode(this.streetNo);
        hash = 41 * hash + Objects.hashCode(this.locality);
        hash = 41 * hash + Objects.hashCode(this.city);
        hash = 41 * hash + Objects.hashCode(this.district);
        hash = 41 * hash + Objects.hashCode(this.state);
        hash = 41 * hash + Objects.hashCode(this.username);
        hash = 41 * hash + Objects.hashCode(this.password);
        hash = 41 * hash + Objects.hashCode(this.usertype);
        hash = 41 * hash + Objects.hashCode(this.creator);
        hash = 41 * hash + Objects.hashCode(this.jobrole);
        hash = 41 * hash + Objects.hashCode(this.pin);
        hash = 41 * hash + Objects.hashCode(this.rdate);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.latitude) ^ (Double.doubleToLongBits(this.latitude) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.longitude) ^ (Double.doubleToLongBits(this.longitude) >>> 32));
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
        final TrainingCenter other = (TrainingCenter) obj;
        if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(other.latitude)) {
            return false;
        }
        if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(other.longitude)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        
        if (!Objects.equals(this.nameSPOC, other.nameSPOC)) {
            return false;
        }
        if (!Objects.equals(this.contactSPOC, other.contactSPOC)) {
            return false;
        }
        if (!Objects.equals(this.buildingNo, other.buildingNo)) {
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
        if (!Objects.equals(this.state, other.state)) {
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
        if (!Objects.equals(this.creator, other.creator)) {
            return false;
        }
        if (!Objects.equals(this.jobrole, other.jobrole)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pin, other.pin)) {
            return false;
        }
        if (!Objects.equals(this.rdate, other.rdate)) {
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
 public String getNameSPOC() {
        return nameSPOC;
    }

    public void setNameSPOC(String nameSPOC) {
        this.nameSPOC = nameSPOC;
    }

    public String getContactSPOC() {
        return contactSPOC;
    }

    public void setContactSPOC(String contactSPOC) {
        this.contactSPOC = contactSPOC;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
}
