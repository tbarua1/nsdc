/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.operation;

import com.tarkesh.entity.BatchSchedule;
import com.tarkesh.entity.Register;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tarkeshwar
 */
class GetSetMonitorSchedule {
    private BatchSchedule schedule;
    private Register trainer;  

    public GetSetMonitorSchedule() {
    }

    public GetSetMonitorSchedule(BatchSchedule schedule, Register trainer) {
        this.schedule = schedule;
        this.trainer = trainer;
    }

    public BatchSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(BatchSchedule schedule) {
        this.schedule = schedule;
    }

    public Register getTrainer() {
        return trainer;
    }

    public void setTrainer(Register trainer) {
        this.trainer = trainer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.schedule);
        hash = 71 * hash + Objects.hashCode(this.trainer);
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
        final GetSetMonitorSchedule other = (GetSetMonitorSchedule) obj;
        if (!Objects.equals(this.schedule, other.schedule)) {
            return false;
        }
        if (!Objects.equals(this.trainer, other.trainer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MonitorSchedule{" + "schedule=" + schedule + ", trainer=" + trainer + '}';
    }

   
    
}
