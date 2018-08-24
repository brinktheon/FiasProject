package com.data.transf.fias.worker.model;


import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stead")
public class Stead {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @NotNull
    private String STEADID;
    @Column(length = 35)
    @NotNull
    private String STEADGUID;
    @Column(length = 2)
    @NotNull
    private int NUMBER;
    @Column(length = 2)
    @NotNull
    private int REGIONCODE;
    @Column(length = 11)
    @NotNull
    private int POSTALCODE;
    @Column(length = 4)
    @NotNull
    private int IFNSFL;
    @Column(length = 4)
    @NotNull
    private int IFNSUL;
    @Column(length = 11)
    @NotNull
    private int OKATO;
    @NotNull
    private Date UPDATEDATE;
    @Column(length = 35)
    @NotNull
    private String PARENTGUID;
    @Column(length = 3)
    @NotNull
    private int OPERSTATUS;
    @NotNull
    private Date STARTDATE;
    @Column(length = 35)
    @NotNull
    private Date ENDDATE;
    @Column(length = 11)
    @NotNull
    private String OKTMO;
    @Column(length = 2)
    @NotNull
    private int LIVESTATUS;
    @Column(length = 3)
    @NotNull
    private int DIVTYPE;
    @Column(length = 35)
    @NotNull
    private String NORMDOC;
}
