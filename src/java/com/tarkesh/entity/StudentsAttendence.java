/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.entity;

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
 * @author Abhishek.Sehgal
 */
@Entity
public class StudentsAttendence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean present;
    private String studentCode;
    @Temporal(TemporalType.TIMESTAMP)
    private Date studentin, studentout;

    @Override
    public String toString() {
        return "StudentsAttendence{" + "id=" + id + ", present=" + present + ", studentCode=" + studentCode + ", studentin=" + studentin + ", studentout=" + studentout + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.present);
        hash = 89 * hash + Objects.hashCode(this.studentCode);
        hash = 89 * hash + Objects.hashCode(this.studentin);
        hash = 89 * hash + Objects.hashCode(this.studentout);
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
        final StudentsAttendence other = (StudentsAttendence) obj;
        if (!Objects.equals(this.studentCode, other.studentCode)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.present, other.present)) {
            return false;
        }
        if (!Objects.equals(this.studentin, other.studentin)) {
            return false;
        }
        if (!Objects.equals(this.studentout, other.studentout)) {
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

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public Date getStudentin() {
        return studentin;
    }

    public void setStudentin(Date studentin) {
        this.studentin = studentin;
    }

    public Date getStudentout() {
        return studentout;
    }

    public void setStudentout(Date studentout) {
        this.studentout = studentout;
    }

}
