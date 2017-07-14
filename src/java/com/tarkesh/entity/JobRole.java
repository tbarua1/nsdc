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
public class JobRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ssc,name,qp_code,industry_type,training_type;
    private Integer industry_visit,nsqf_level,theory,practical,aditional_duration,degital_literacy, total_hours; 
private Boolean paid;

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "JobRole{" + "id=" + id + ", ssc=" + ssc + ", name=" + name + ", qp_code=" + qp_code + ", industry_type=" + industry_type + ", training_type=" + training_type + ", total_industry_visit=" + industry_visit + ", nsqf_level=" + nsqf_level + ", theory=" + theory + ", practical=" + practical + ", aditional_duration=" + aditional_duration + ", degital_literacy=" + degital_literacy + ", total_hours=" + total_hours + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.ssc);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.qp_code);
        hash = 11 * hash + Objects.hashCode(this.industry_type);
        hash = 11 * hash + Objects.hashCode(this.training_type);
        hash = 11 * hash + Objects.hashCode(this.industry_visit);
        hash = 11 * hash + Objects.hashCode(this.nsqf_level);
        hash = 11 * hash + Objects.hashCode(this.theory);
        hash = 11 * hash + Objects.hashCode(this.practical);
        hash = 11 * hash + Objects.hashCode(this.aditional_duration);
        hash = 11 * hash + Objects.hashCode(this.degital_literacy);
        hash = 11 * hash + Objects.hashCode(this.total_hours);
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
        final JobRole other = (JobRole) obj;
        if (!Objects.equals(this.ssc, other.ssc)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.qp_code, other.qp_code)) {
            return false;
        }
        if (!Objects.equals(this.industry_type, other.industry_type)) {
            return false;
        }
        if (!Objects.equals(this.training_type, other.training_type)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.industry_visit, other.industry_visit)) {
            return false;
        }
        if (!Objects.equals(this.nsqf_level, other.nsqf_level)) {
            return false;
        }
        if (!Objects.equals(this.theory, other.theory)) {
            return false;
        }
        if (!Objects.equals(this.practical, other.practical)) {
            return false;
        }
        if (!Objects.equals(this.aditional_duration, other.aditional_duration)) {
            return false;
        }
        if (!Objects.equals(this.degital_literacy, other.degital_literacy)) {
            return false;
        }
        if (!Objects.equals(this.total_hours, other.total_hours)) {
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

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQp_code() {
        return qp_code;
    }

    public void setQp_code(String qp_code) {
        this.qp_code = qp_code;
    }

    public String getIndustry_type() {
        return industry_type;
    }

    public void setIndustry_type(String industry_type) {
        this.industry_type = industry_type;
    }

    public String getTraining_type() {
        return training_type;
    }

    public void setTraining_type(String training_type) {
        this.training_type = training_type;
    }

    public Integer getIndustry_visit() {
        return industry_visit;
    }

    public void setIndustry_visit(Integer total_industry_visit) {
        this.industry_visit = total_industry_visit;
    }

    public Integer getNsqf_level() {
        return nsqf_level;
    }

    public void setNsqf_level(Integer nsqf_level) {
        this.nsqf_level = nsqf_level;
    }

    public Integer getTheory() {
        return theory;
    }

    public void setTheory(Integer theory) {
        this.theory = theory;
    }

    public Integer getPractical() {
        return practical;
    }

    public void setPractical(Integer practical) {
        this.practical = practical;
    }

    public Integer getAditional_duration() {
        return aditional_duration;
    }

    public void setAditional_duration(Integer aditional_duration) {
        this.aditional_duration = aditional_duration;
    }

    public Integer getDegital_literacy() {
        return degital_literacy;
    }

    public void setDegital_literacy(Integer degital_literacy) {
        this.degital_literacy = degital_literacy;
    }

    public Integer getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(Integer total_hours) {
        this.total_hours = total_hours;
    }
    
}
