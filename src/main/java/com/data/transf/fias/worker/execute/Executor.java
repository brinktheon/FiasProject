package com.data.transf.fias.worker.execute;

import org.xml.sax.helpers.DefaultHandler;

import java.io.File;;
import java.util.Map;

public class Executor {

    public Executor() {

    }

    public void execute() {
        for (Map.Entry<File, DefaultHandler> entry : Relationship.getMap().entrySet()) {
            new Thread(new Parser(entry.getKey(), entry.getValue())).start();
        }
    }
}
