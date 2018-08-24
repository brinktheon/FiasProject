package com.data.transf.fias.worker.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "norm_doc")
public class NormativeDocument {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @NotNull
    private String NORMDOCID;
    @NotNull
    private String DOCNAME;
    @NotNull
    private Date DOCDATE;
    @Column(length = 11)
    @NotNull
    private String DOCNUM;
    @Column(length = 3)
    @NotNull
    private int DOCTYPE;
}
