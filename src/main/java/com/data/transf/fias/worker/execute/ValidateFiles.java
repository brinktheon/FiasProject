package com.data.transf.fias.worker.execute;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Возвращает список файлов .XML по маске. Путь указан в application.properties
 * */
public class ValidateFiles {
    private Properties prop = null;
    private InputStream input = null;
    private Pattern pattern = null;
    private ClassLoader classLoader = null;
    private File file = null;
    private File returnedFile = null;

    public ValidateFiles() {
        prop = new Properties();
        classLoader = getClass().getClassLoader();
        file = new File(Objects.requireNonNull(classLoader.getResource("application.properties")).getFile());
    }

    public File findFiles(String mask)  {
        pattern= Pattern.compile("AS_(.*?)_");
        try {
            input = new FileInputStream(file);
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        File folder = new File(prop.getProperty("fias.data.folder"));
        File [] files = folder.listFiles((dir, name) -> {
            Matcher matcher = pattern.matcher(name);
            String str = "null";
            if (matcher.find()) {
                str = name.substring(0, 3) + matcher.group(1) + "_";
            }
            return name.startsWith(str);
        });

        for (File file1 : files) {
            if (file1.getName().contains(mask)){
                returnedFile = file1;
            }
        }

        return returnedFile;
    }
}
