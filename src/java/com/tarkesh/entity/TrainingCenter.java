package com.tarkesh.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private String name, university_type,nameSPOC,contactSPOC;
    private String buildingNo,streetNo,locality,city,district,state;
    private Integer pin;
    @Temporal(TemporalType.DATE)
    private Date rdate;   
    @OneToMany
    private List<JobRole> jobrole;    
    private double latitude, longitude;

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

    public String getUniversity_type() {
        return university_type;
    }

    public void setUniversity_type(String university_type) {
        this.university_type = university_type;
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

    public List<JobRole> getJobrole() {
        return jobrole;
    }

    public void setJobrole(List<JobRole> jobrole) {
        this.jobrole = jobrole;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.university_type);
        hash = 67 * hash + Objects.hashCode(this.nameSPOC);
        hash = 67 * hash + Objects.hashCode(this.contactSPOC);
        hash = 67 * hash + Objects.hashCode(this.buildingNo);
        hash = 67 * hash + Objects.hashCode(this.streetNo);
        hash = 67 * hash + Objects.hashCode(this.locality);
        hash = 67 * hash + Objects.hashCode(this.city);
        hash = 67 * hash + Objects.hashCode(this.district);
        hash = 67 * hash + Objects.hashCode(this.state);
        hash = 67 * hash + Objects.hashCode(this.pin);
        hash = 67 * hash + Objects.hashCode(this.rdate);
        hash = 67 * hash + Objects.hashCode(this.jobrole);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.latitude) ^ (Double.doubleToLongBits(this.latitude) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.longitude) ^ (Double.doubleToLongBits(this.longitude) >>> 32));
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
        if (!Objects.equals(this.university_type, other.university_type)) {
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pin, other.pin)) {
            return false;
        }
        if (!Objects.equals(this.rdate, other.rdate)) {
            return false;
        }
        if (!Objects.equals(this.jobrole, other.jobrole)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrainingCenter{" + "id=" + id + ", name=" + name + ", university_type=" + university_type + ", nameSPOC=" + nameSPOC + ", contactSPOC=" + contactSPOC + ", buildingNo=" + buildingNo + ", streetNo=" + streetNo + ", locality=" + locality + ", city=" + city + ", district=" + district + ", state=" + state + ", pin=" + pin + ", rdate=" + rdate + ", jobrole=" + jobrole + ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }
  
}
