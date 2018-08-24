package com.data.transf.fias.worker.execute;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Parser implements Runnable{
    private File file;
    private DefaultHandler handler;
    private SAXParser parser;
    private SAXParserFactory saxParserFactory;

    public Parser(File file, DefaultHandler handler) {
        this.file = file;
        this.handler = handler;
        this.saxParserFactory = SAXParserFactory.newInstance();
    }

    @Override
    public void run() {
        try {
            parser = saxParserFactory.newSAXParser();
            parser.parse(file, handler);

        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
