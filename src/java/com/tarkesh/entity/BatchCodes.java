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
 * @author tarun
 */
@Entity
public class BatchCodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String batchCode,ssc,jobrole, trainer_name,trainer_contact,state,
            district,smarttcid,tariningcentername,qpcode;
    private Integer batchSize_start,batchSize_ondate, completed_hours;

    @Override
    public String toString() {
        return "BatchCodes{" + "id=" + id + ", batchCode=" + batchCode + ", ssc=" + ssc + ", jobrole=" + jobrole + ", trainer_name=" + trainer_name + ", trainer_contact=" + trainer_contact + ", state=" + state + ", district=" + district + ", smarttcid=" + smarttcid + ", tariningcentername=" + tariningcentername + ", qpcode=" + qpcode + ", batchSize_start=" + batchSize_start + ", batchSize_ondate=" + batchSize_ondate + ", completed_hours=" + completed_hours + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.batchCode);
        hash = 89 * hash + Objects.hashCode(this.ssc);
        hash = 89 * hash + Objects.hashCode(this.jobrole);
        hash = 89 * hash + Objects.hashCode(this.trainer_name);
        hash = 89 * hash + Objects.hashCode(this.trainer_contact);
        hash = 89 * hash + Objects.hashCode(this.state);
        hash = 89 * hash + Objects.hashCode(this.district);
        hash = 89 * hash + Objects.hashCode(this.smarttcid);
        hash = 89 * hash + Objects.hashCode(this.tariningcentername);
        hash = 89 * hash + Objects.hashCode(this.qpcode);
        hash = 89 * hash + Objects.hashCode(this.batchSize_start);
        hash = 89 * hash + Objects.hashCode(this.batchSize_ondate);
        hash = 89 * hash + Objects.hashCode(this.completed_hours);
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
        final BatchCodes other = (BatchCodes) obj;
        if (!Objects.equals(this.batchCode, other.batchCode)) {
            return false;
        }
        if (!Objects.equals(this.ssc, other.ssc)) {
            return false;
        }
        if (!Objects.equals(this.jobrole, other.jobrole)) {
            return false;
        }
        if (!Objects.equals(this.trainer_name, other.trainer_name)) {
            return false;
        }
        if (!Objects.equals(this.trainer_contact, other.trainer_contact)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.district, other.district)) {
            return false;
        }
        if (!Objects.equals(this.smarttcid, other.smarttcid)) {
            return false;
        }
        if (!Objects.equals(this.tariningcentername, other.tariningcentername)) {
            return false;
        }
        if (!Objects.equals(this.qpcode, other.qpcode)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.batchSize_start, other.batchSize_start)) {
            return false;
        }
        if (!Objects.equals(this.batchSize_ondate, other.batchSize_ondate)) {
            return false;
        }
        if (!Objects.equals(this.completed_hours, other.completed_hours)) {
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

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
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

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public String getTrainer_contact() {
        return trainer_contact;
    }

    public void setTrainer_contact(String trainer_contact) {
        this.trainer_contact = trainer_contact;
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

    public String getSmarttcid() {
        return smarttcid;
    }

    public void setSmarttcid(String smarttcid) {
        this.smarttcid = smarttcid;
    }

    public String getTariningcentername() {
        return tariningcentername;
    }

    public void setTariningcentername(String tariningcentername) {
        this.tariningcentername = tariningcentername;
    }

    public String getQpcode() {
        return qpcode;
    }

    public void setQpcode(String qpcode) {
        this.qpcode = qpcode;
    }

    public Integer getBatchSize_start() {
        return batchSize_start;
    }

    public void setBatchSize_start(Integer batchSize_start) {
        this.batchSize_start = batchSize_start;
    }

    public Integer getBatchSize_ondate() {
        return batchSize_ondate;
    }

    public void setBatchSize_ondate(Integer batchSize_ondate) {
        this.batchSize_ondate = batchSize_ondate;
    }

    public Integer getCompleted_hours() {
        return completed_hours;
    }

    public void setCompleted_hours(Integer completed_hours) {
        this.completed_hours = completed_hours;
    }

}
