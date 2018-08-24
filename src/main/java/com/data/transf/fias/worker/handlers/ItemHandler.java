package com.data.transf.fias.worker.handlers;

import com.data.transf.fias.worker.services.Impl.ItemServiceImpl;
import com.data.transf.fias.worker.model.Item;
import com.data.transf.fias.worker.services.ItemService;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ItemHandler extends DefaultHandler {

    private List<Item> itemList = null;
    private Item item = null;
    private final int maxSize;

    private final ItemService service;

    SimpleDateFormat format;

    public ItemHandler(ItemService service) {
        this.format = new SimpleDateFormat("yyyy-MM-dd");
        this.maxSize = 120_000;
        this.itemList = new ArrayList<>(maxSize);
        this.service = service;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("Object")) {
            String id = attributes.getValue("AOID");
            item = new Item();
            item.setAOID(id);

            id = attributes.getValue("AOGUID");
            item.setAOGUID(id);

            id = attributes.getValue("AUTOCODE");
            item.setAUTOCODE(id);

            id = attributes.getValue("FORMALNAME");
            item.setFORMALNAME(id);

            id = attributes.getValue("CURRSTATUS");
            item.setCURRSTATUS(Integer.valueOf(id));

            id = attributes.getValue("OPERSTATUS");
            item.setOPERSTATUS(Integer.valueOf(id));

            id = attributes.getValue("CENTSTATUS");
            item.setCENTSTATUS(Integer.valueOf(id));

            id = attributes.getValue("ACTSTATUS");
            item.setACTSTATUS(Integer.valueOf(id));

            id = attributes.getValue("PLAINCODE");
            item.setPLAINCODE(id);

            id = attributes.getValue("CODE");
            item.setCODE(id);

            id = attributes.getValue("NEXTID");
            item.setNEXTID(id);

            id = attributes.getValue("PREVID");
            item.setPREVID(id);

            id = attributes.getValue("PARENTGUID");
            item.setPARENTGUID(id);

            id = attributes.getValue("AOLEVEL");
            item.setAOLEVEL(Integer.valueOf(id));

            id = attributes.getValue("SHORTNAME");
            item.setSHORTNAME(id);

            id = attributes.getValue("UPDATEDATE");
            try {
                item.setUPDATEDATE(format.parse(id));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            id = attributes.getValue("OKATO");
            item.setOKATO(id);

            id = attributes.getValue("OKTMO");
            item.setOKTMO(id);

            id = attributes.getValue("TERRIFNSUL");
            item.setTERRIFNSUL(id);

            id = attributes.getValue("POSTALCODE");
            item.setPOSTALCODE(id);

            id = attributes.getValue("OFFNAME");
            item.setOFFNAME(id);

            id = attributes.getValue("EXTRCODE");
            item.setEXTRCODE(id);

            id = attributes.getValue("IFNSFL");
            item.setIFNSFL(id);

            id = attributes.getValue("STREETCODE");
            item.setSTREETCODE(id);

            id = attributes.getValue("PLACECODE");
            item.setPLACECODE(id);

            id = attributes.getValue("CITYCODE");
            item.setCITYCODE(id);

            id = attributes.getValue("AREACODE");
            item.setAREACODE(id);

            id = attributes.getValue("REGIONCODE");
            item.setREGIONCODE(id);

            id = attributes.getValue("CTARCODE");
            item.setCTARCODE(id);

            id = attributes.getValue("STARTDATE");
            try {
                item.setSTARTDATE(format.parse(id));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            id = attributes.getValue("ENDDATE");
            try {
                item.setENDDATE(format.parse(id));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            id = attributes.getValue("NORMDOC");
            item.setNORMDOC(id);

            id = attributes.getValue("LIVESTATUS");
            item.setLIVESTATUS(Integer.valueOf(id));

        }
    }

    @Override
    public synchronized void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Object")) {
            itemList.add(item);
            if (itemList.size() == maxSize) {
                service.saveAllItems(itemList);
                itemList.clear();
            }
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

    }
}
