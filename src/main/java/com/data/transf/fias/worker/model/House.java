package com.data.transf.fias.worker.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @NotNull
    private String HOUSEID;
    @Column(length = 36)
    @NotNull
    private String HOUSEGUID;
    @Column(length = 36)
    @NotNull
    private String AOGUID;
    @NotNull
    private String HOUSENUM;
    @NotNull
    private int STRSTATUS;
    @NotNull
    private int ESTSTATUS;
    @NotNull
    private int STATSTATUS;
    @NotNull
    private int IFNSFL;
    @NotNull
    private int IFNSUL;
    @Column(length = 36)
    @NotNull
    private String OKATO;
    @Column(length = 36)
    @NotNull
    private String OKTMO;
    @NotNull
    private int POSTALCODE;
    @NotNull
    private Date STARTDATE;
    @NotNull
    private Date ENDDATE;
    @NotNull
    private Date UPDATEDATE;
    @NotNull
    private int COUNTER ;
    @NotNull
    private int DIVTYPE;
    @NotNull
    private int REGIONCODE;

    public House() {
    }

    public String getHOUSEID() {
        return HOUSEID;
    }

    public void setHOUSEID(String HOUSEID) {
        this.HOUSEID = HOUSEID;
    }

    public String getHOUSEGUID() {
        return HOUSEGUID;
    }

    public void setHOUSEGUID(String HOUSEGUID) {
        this.HOUSEGUID = HOUSEGUID;
    }

    public String getAOGUID() {
        return AOGUID;
    }

    public void setAOGUID(String AOGUID) {
        this.AOGUID = AOGUID;
    }

    public String getHOUSENUM() {
        return HOUSENUM;
    }

    public void setHOUSENUM(String HOUSENUM) {
        this.HOUSENUM = HOUSENUM;
    }

    public int getSTRSTATUS() {
        return STRSTATUS;
    }

    public void setSTRSTATUS(int STRSTATUS) {
        this.STRSTATUS = STRSTATUS;
    }

    public int getESTSTATUS() {
        return ESTSTATUS;
    }

    public void setESTSTATUS(int ESTSTATUS) {
        this.ESTSTATUS = ESTSTATUS;
    }

    public int getSTATSTATUS() {
        return STATSTATUS;
    }

    public void setSTATSTATUS(int STATSTATUS) {
        this.STATSTATUS = STATSTATUS;
    }

    public int getIFNSFL() {
        return IFNSFL;
    }

    public void setIFNSFL(int IFNSFL) {
        this.IFNSFL = IFNSFL;
    }

    public int getIFNSUL() {
        return IFNSUL;
    }

    public void setIFNSUL(int IFNSUL) {
        this.IFNSUL = IFNSUL;
    }

    public String getOKATO() {
        return OKATO;
    }

    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }

    public String getOKTMO() {
        return OKTMO;
    }

    public void setOKTMO(String OKTMO) {
        this.OKTMO = OKTMO;
    }

    public int getPOSTALCODE() {
        return POSTALCODE;
    }

    public void setPOSTALCODE(int POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    public Date getSTARTDATE() {
        return STARTDATE;
    }

    public void setSTARTDATE(Date STARTDATE) {
        this.STARTDATE = STARTDATE;
    }

    public Date getENDDATE() {
        return ENDDATE;
    }

    public void setENDDATE(Date ENDDATE) {
        this.ENDDATE = ENDDATE;
    }

    public Date getUPDATEDATE() {
        return UPDATEDATE;
    }

    public void setUPDATEDATE(Date UPDATEDATE) {
        this.UPDATEDATE = UPDATEDATE;
    }

    public int getCOUNTER() {
        return COUNTER;
    }

    public void setCOUNTER(int COUNTER) {
        this.COUNTER = COUNTER;
    }

    public int getDIVTYPE() {
        return DIVTYPE;
    }

    public void setDIVTYPE(int DIVTYPE) {
        this.DIVTYPE = DIVTYPE;
    }

    public int getREGIONCODE() {
        return REGIONCODE;
    }

    public void setREGIONCODE(int REGIONCODE) {
        this.REGIONCODE = REGIONCODE;
    }
}
