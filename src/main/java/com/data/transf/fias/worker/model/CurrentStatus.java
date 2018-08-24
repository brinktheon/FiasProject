package com.data.transf.fias.worker.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "current_st")
public class CurrentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int CURENTSTID;
    @NotNull
    private String NAME;
}
