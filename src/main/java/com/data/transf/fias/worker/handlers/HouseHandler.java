package com.data.transf.fias.worker.handlers;

import com.data.transf.fias.worker.services.HouseService;
import com.data.transf.fias.worker.services.Impl.HouseServiceImpl;
import com.data.transf.fias.worker.model.House;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class HouseHandler extends DefaultHandler {
    private List<House> houseList = null;
    private House house = null;
    private SimpleDateFormat format = null;
    private int maxSize;


    private final HouseService service;

    public HouseHandler(HouseService service) {
        this.format = new SimpleDateFormat("yyyy-MM-dd");
        this.houseList = new ArrayList<>(maxSize);
        this.maxSize = 120_000;
        this.service = service;
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("House")) {
            String id = attributes.getValue("HOUSEID");
            house = new House();
            house.setHOUSEID(id);

            id = attributes.getValue("HOUSEGUID");
            if (id != null) {
                house.setHOUSEGUID(id);
            }
            id = attributes.getValue("AOGUID");
            if (id != null) {
                house.setAOGUID(id);
            }
            id = attributes.getValue("HOUSENUM");
            if (id != null) {
                house.setHOUSENUM(id);
            }
            id = attributes.getValue("STRSTATUS");
            if (id != null) {
                house.setSTRSTATUS(Integer.valueOf(id));
            }
            id = attributes.getValue("ESTSTATUS");
            if (id != null) {
                house.setESTSTATUS(Integer.valueOf(id));
            }
            id = attributes.getValue("STATSTATUS");
            if (id != null) {
                house.setSTATSTATUS(Integer.valueOf(id));
            }
            id = attributes.getValue("IFNSFL");
            if (id != null) {
                house.setIFNSFL(Integer.valueOf(id));
            }
            id = attributes.getValue("IFNSUL");
            if (id != null) {
                house.setIFNSUL(Integer.parseInt(id));
            }
            id = attributes.getValue("OKATO");
            if (id != null) {
                house.setOKATO(id);
            }
            id = attributes.getValue("OKTMO");
            if (id != null) {
                house.setOKTMO(id);
            }
            id = attributes.getValue("POSTALCODE");
            if (id != null) {
                house.setPOSTALCODE(Integer.valueOf(id));
            }
            id = attributes.getValue("STARTDATE");
            try {
                if (id != null) {
                    house.setSTARTDATE(format.parse(id));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }

            id = attributes.getValue("ENDDATE");
            try {
                if (id != null) {
                    house.setENDDATE(format.parse(id));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }

            id = attributes.getValue("UPDATEDATE");
            try {
                if (id != null) {
                    house.setUPDATEDATE(format.parse(id));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }

            id = attributes.getValue("COUNTER");
            if (id != null) {
                house.setCOUNTER(Integer.parseInt(id));
            }
            id = attributes.getValue("DIVTYPE");
            if (id != null) {
                house.setDIVTYPE(Integer.parseInt(id));
            }
            id = attributes.getValue("REGIONCODE");
            if (id != null) {
                house.setREGIONCODE(Integer.parseInt(id));
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("House")) {
            houseList.add(house);
            if (houseList.size() == maxSize) {
                service.saveAllHouses(houseList);
                houseList.clear();
            }
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

    }
}
