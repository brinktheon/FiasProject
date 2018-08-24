package com.data.transf.fias.worker.model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "address_object")
public class Item implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @NotNull
    private String AOID;
    @Column(length = 35)
    @NotNull
    private String PARENTGUID;
    @Column(length = 120)
    @NotNull
    private String FORMALNAME;
    @Column(length = 2)
    @NotNull
    private String REGIONCODE;
    @Column(length = 1)
    @NotNull
    private String AUTOCODE;
    @Column(length = 3)
    @NotNull
    private String AREACODE;
    @Column(length = 3)
    @NotNull
    private String CITYCODE;
    @Column(length = 3)
    @NotNull
    private String CTARCODE;
    @Column(length = 3)
    @NotNull
    private String PLACECODE;
    @Column(length = 4)
    @NotNull
    private String STREETCODE;
    @Column(length = 4)
    @NotNull
    private String EXTRCODE;
    @Column(length = 3)
    @NotNull
    private String SEXTCODE;
    @Column(length = 120)
    @NotNull
    private String OFFNAME;
    @Column(length = 6)
    @NotNull
    private String POSTALCODE;
    @Column(length = 4)
    @NotNull
    private String IFNSFL;
    @Column(length = 4)
    @NotNull
    private String TERRIFNSFL;
    @Column(length = 4)
    @NotNull
    private String IFNSUL;
    @Column(length = 4)
    @NotNull
    private String TERRIFNSUL;
    @Column(length = 11)
    @NotNull
    private String OKATO;
    @Column(length = 11)
    @NotNull
    private String OKTMO;
    @NotNull
    private Date UPDATEDATE;
    @Column(length = 10)
    @NotNull
    private String SHORTNAME;
    @Column(length = 11)
    @NotNull
    private int AOLEVEL;
    @Column(length = 36)
    @NotNull
    private String AOGUID;
    @Column(length = 36)
    @NotNull
    private String PREVID;
    @Column(length = 36)
    @NotNull
    private String NEXTID;
    @Column(length = 17)
    @NotNull
    private String CODE;
    @Column(length = 15)
    @NotNull
    private String PLAINCODE;
    @Column(length = 11)
    @NotNull
    private int ACTSTATUS;
    @Column(length = 11)
    @NotNull
    private int CENTSTATUS;
    @Column(length = 11)
    @NotNull
    private int OPERSTATUS;
    @Column(length = 11)
    @NotNull
    private int CURRSTATUS;
    @NotNull
    private Date STARTDATE;
    @NotNull
    private Date ENDDATE;
    @Column(length = 36)
    @NotNull
    private String NORMDOC;
    @Column(length = 11)
    @NotNull
    private int LIVESTATUS;

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "AOGUID='" + AOGUID + '\'' +
                ", FORMALNAME='" + FORMALNAME + '\'' +
                ", REGIONCODE='" + REGIONCODE + '\'' +
                ", AUTOCODE='" + AUTOCODE + '\'' +
                ", AREACODE='" + AREACODE + '\'' +
                ", CITYCODE='" + CITYCODE + '\'' +
                ", CTARCODE='" + CTARCODE + '\'' +
                ", PLACECODE='" + PLACECODE + '\'' +
                ", STREETCODE='" + STREETCODE + '\'' +
                ", EXTRCODE='" + EXTRCODE + '\'' +
                ", SEXTCODE='" + SEXTCODE + '\'' +
                ", OFFNAME='" + OFFNAME + '\'' +
                ", POSTALCODE='" + POSTALCODE + '\'' +
                ", IFNSFL='" + IFNSFL + '\'' +
                ", TERRIFNSFL='" + TERRIFNSFL + '\'' +
                ", IFNSUL='" + IFNSUL + '\'' +
                ", TERRIFNSUL='" + TERRIFNSUL + '\'' +
                ", OKATO='" + OKATO + '\'' +
                ", OKTMO='" + OKTMO + '\'' +
                ", UPDATEDATE='" + UPDATEDATE + '\'' +
                ", SHORTNAME='" + SHORTNAME + '\'' +
                ", AOLEVEL='" + AOLEVEL + '\'' +
                ", PARENTGUID='" + PARENTGUID + '\'' +
                ", AOID='" + AOID + '\'' +
                ", PREVID='" + PREVID + '\'' +
                ", NEXTID='" + NEXTID + '\'' +
                ", CODE='" + CODE + '\'' +
                ", PLAINCODE='" + PLAINCODE + '\'' +
                ", ACTSTATUS='" + ACTSTATUS + '\'' +
                ", CENTSTATUS='" + CENTSTATUS + '\'' +
                ", OPERSTATUS='" + OPERSTATUS + '\'' +
                ", CURRSTATUS='" + CURRSTATUS + '\'' +
                ", STARTDATE='" + STARTDATE + '\'' +
                ", ENDDATE='" + ENDDATE + '\'' +
                ", NORMDOC='" + NORMDOC + '\'' +
                ", LIVESTATUS='" + LIVESTATUS + '\'' +
                '}';
    }

    public String getAOGUID() {
        return AOGUID;
    }

    public void setAOGUID(String AOGUID) {
        this.AOGUID = AOGUID;
    }

    public String getPARENTGUID() {
        return PARENTGUID;
    }

    public void setPARENTGUID(String PARENTGUID) {
        this.PARENTGUID = PARENTGUID;
    }

    public String getFORMALNAME() {
        return FORMALNAME;
    }

    public void setFORMALNAME(String FORMALNAME) {
        this.FORMALNAME = FORMALNAME;
    }

    public String getREGIONCODE() {
        return REGIONCODE;
    }

    public void setREGIONCODE(String REGIONCODE) {
        this.REGIONCODE = REGIONCODE;
    }

    public String getAUTOCODE() {
        return AUTOCODE;
    }

    public void setAUTOCODE(String AUTOCODE) {
        this.AUTOCODE = AUTOCODE;
    }

    public String getAREACODE() {
        return AREACODE;
    }

    public void setAREACODE(String AREACODE) {
        this.AREACODE = AREACODE;
    }

    public String getCITYCODE() {
        return CITYCODE;
    }

    public void setCITYCODE(String CITYCODE) {
        this.CITYCODE = CITYCODE;
    }

    public String getCTARCODE() {
        return CTARCODE;
    }

    public void setCTARCODE(String CTARCODE) {
        this.CTARCODE = CTARCODE;
    }

    public String getPLACECODE() {
        return PLACECODE;
    }

    public void setPLACECODE(String PLACECODE) {
        this.PLACECODE = PLACECODE;
    }

    public String getSTREETCODE() {
        return STREETCODE;
    }

    public void setSTREETCODE(String STREETCODE) {
        this.STREETCODE = STREETCODE;
    }

    public String getEXTRCODE() {
        return EXTRCODE;
    }

    public void setEXTRCODE(String EXTRCODE) {
        this.EXTRCODE = EXTRCODE;
    }

    public String getSEXTCODE() {
        return SEXTCODE;
    }

    public void setSEXTCODE(String SEXTCODE) {
        this.SEXTCODE = SEXTCODE;
    }

    public String getOFFNAME() {
        return OFFNAME;
    }

    public void setOFFNAME(String OFFNAME) {
        this.OFFNAME = OFFNAME;
    }

    public String getPOSTALCODE() {
        return POSTALCODE;
    }

    public void setPOSTALCODE(String POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    public String getIFNSFL() {
        return IFNSFL;
    }

    public void setIFNSFL(String IFNSFL) {
        this.IFNSFL = IFNSFL;
    }

    public String getTERRIFNSFL() {
        return TERRIFNSFL;
    }

    public void setTERRIFNSFL(String TERRIFNSFL) {
        this.TERRIFNSFL = TERRIFNSFL;
    }

    public String getIFNSUL() {
        return IFNSUL;
    }

    public void setIFNSUL(String IFNSUL) {
        this.IFNSUL = IFNSUL;
    }

    public String getTERRIFNSUL() {
        return TERRIFNSUL;
    }

    public void setTERRIFNSUL(String TERRIFNSUL) {
        this.TERRIFNSUL = TERRIFNSUL;
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

    public Date getUPDATEDATE() {
        return UPDATEDATE;
    }

    public void setUPDATEDATE(Date UPDATEDATE) {
        this.UPDATEDATE = UPDATEDATE;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public int getAOLEVEL() {
        return AOLEVEL;
    }

    public void setAOLEVEL(int AOLEVEL) {
        this.AOLEVEL = AOLEVEL;
    }

    public String getAOID() {
        return AOID;
    }

    public void setAOID(String AOID) {
        this.AOID = AOID;
    }

    public String getPREVID() {
        return PREVID;
    }

    public void setPREVID(String PREVID) {
        this.PREVID = PREVID;
    }

    public String getNEXTID() {
        return NEXTID;
    }

    public void setNEXTID(String NEXTID) {
        this.NEXTID = NEXTID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getPLAINCODE() {
        return PLAINCODE;
    }

    public void setPLAINCODE(String PLAINCODE) {
        this.PLAINCODE = PLAINCODE;
    }

    public int getACTSTATUS() {
        return ACTSTATUS;
    }

    public void setACTSTATUS(int ACTSTATUS) {
        this.ACTSTATUS = ACTSTATUS;
    }

    public int getCENTSTATUS() {
        return CENTSTATUS;
    }

    public void setCENTSTATUS(int CENTSTATUS) {
        this.CENTSTATUS = CENTSTATUS;
    }

    public int getOPERSTATUS() {
        return OPERSTATUS;
    }

    public void setOPERSTATUS(int OPERSTATUS) {
        this.OPERSTATUS = OPERSTATUS;
    }

    public int getCURRSTATUS() {
        return CURRSTATUS;
    }

    public void setCURRSTATUS(int CURRSTATUS) {
        this.CURRSTATUS = CURRSTATUS;
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

    public String getNORMDOC() {
        return NORMDOC;
    }

    public void setNORMDOC(String NORMDOC) {
        this.NORMDOC = NORMDOC;
    }

    public int getLIVESTATUS() {
        return LIVESTATUS;
    }

    public void setLIVESTATUS(int LIVESTATUS) {
        this.LIVESTATUS = LIVESTATUS;
    }
}
