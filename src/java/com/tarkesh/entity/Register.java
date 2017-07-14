package com.tarkesh.entity;

/*s
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
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author tarkeshwarssss
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Register implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, qualification, jobRole, experience, nationality, mobile, 
            skype, username, password, emailid, usertype,whatsapp,photo,state,district;
    @Temporal(TemporalType.DATE)
    private Date registeredDate;

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

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }


    public Date getDate() {
        return registeredDate;
    }

    public void setDate(Date date) {
        this.registeredDate = date;
    }
    public void setDate() {
        this.registeredDate = new Date();
    }

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSkillset() {
        return jobRole;
    }

    public void setSkillset(String skillset) {
        this.jobRole = skillset;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getNatianality() {
        return nationality;
    }

    public void setNatianality(String natianality) {
        this.nationality = natianality;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
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

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "Trainer{" + "id=" + id + ", name=" + name + ", qualification=" + qualification + ", skillset=" + jobRole + ", experience=" + experience + ", natianality=" + nationality + ", mobile=" + mobile + ", skype=" + skype + ", username=" + username + ", password=" + password + ", emailid=" + emailid + ", usertype=" + usertype + ", date=" + registeredDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.qualification);
        hash = 29 * hash + Objects.hashCode(this.jobRole);
        hash = 29 * hash + Objects.hashCode(this.experience);
        hash = 29 * hash + Objects.hashCode(this.nationality);
        hash = 29 * hash + Objects.hashCode(this.mobile);
        hash = 29 * hash + Objects.hashCode(this.skype);
        hash = 29 * hash + Objects.hashCode(this.username);
        hash = 29 * hash + Objects.hashCode(this.password);
        hash = 29 * hash + Objects.hashCode(this.emailid);
        hash = 29 * hash + Objects.hashCode(this.usertype);
        hash = 29 * hash + Objects.hashCode(this.registeredDate);
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
        final Register other = (Register) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.qualification, other.qualification)) {
            return false;
        }
        if (!Objects.equals(this.jobRole, other.jobRole)) {
            return false;
        }
        if (!Objects.equals(this.experience, other.experience)) {
            return false;
        }
        if (!Objects.equals(this.nationality, other.nationality)) {
            return false;
        }
        if (!Objects.equals(this.mobile, other.mobile)) {
            return false;
        }
        if (!Objects.equals(this.skype, other.skype)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.emailid, other.emailid)) {
            return false;
        }
        if (!Objects.equals(this.usertype, other.usertype)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.registeredDate, other.registeredDate);
    }

}
