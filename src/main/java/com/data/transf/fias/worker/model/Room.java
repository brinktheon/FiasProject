package com.data.transf.fias.worker.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @NotNull
    private String ROOMID;
    @Column(length = 35)
    @NotNull
    private String ROOMGUID;
    @Column(length = 35)
    @NotNull
    private String HOUSEGUID;
    @Column(length = 35)
    @NotNull
    private String REGIONCODE;
    @Column(length = 2)
    @NotNull
    private int FLATNUMBER;
    @Column(length = 2)
    @NotNull
    private int FLATTYPE;
    @Column(length = 35)
    @NotNull
    private String CADNUM;
    @Column(length = 11)
    @NotNull
    private int POSTALCODE;
    @NotNull
    private Date UPDATEDATE;
    @Column(length = 11)
    @NotNull
    private int OPERSTATUS;
    @NotNull
    private Date STARTDATE;
    @NotNull
    private Date ENDDATE;
    @Column(length = 11)
    @NotNull
    private int LIVESTATUS;
    @Column(length = 35)
    @NotNull
    private String NORMDOC;
}
