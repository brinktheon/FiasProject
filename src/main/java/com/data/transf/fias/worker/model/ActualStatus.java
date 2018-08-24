package com.data.transf.fias.worker.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "actual_st")
public class ActualStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int ACTSTATID;
    @Column(length = 16)
    @NotNull
    private String NAME;
}
