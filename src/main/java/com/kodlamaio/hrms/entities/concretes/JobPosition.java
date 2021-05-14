package com.kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="pos_id")
    private int pid;

    @Column(name="title")
    private String title;


    public JobPosition() {}

    public JobPosition(int pid, String title) {
        this.pid = pid;
        this.title = title;
    }
}
