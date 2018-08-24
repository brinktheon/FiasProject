package com.data.transf.fias.worker.execute;

import org.xml.sax.helpers.DefaultHandler;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/*
* Связь файл - хендлер
* */
public class Relationship {
    private static Map<File, DefaultHandler> map = new HashMap<>();

    public static void putRelationship(String mask, DefaultHandler handler){
        File file = new ValidateFiles().findFiles(mask);
        map.put(file, handler);
    }

    public static Map<File, DefaultHandler> getMap() {
        return map;
    }
}
