package com.data.transf.fias.worker.model;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "center_st")
public class CenterStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int CENTERSTID;
    @NotNull
    private String NAME;
}
