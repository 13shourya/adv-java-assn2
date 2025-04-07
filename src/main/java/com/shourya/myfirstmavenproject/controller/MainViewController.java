package com.shourya.myfirstmavenproject.controller;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ApiController {
    public void convertToPDF(String urlToConvert) {
        String accessKey = "b50217e305ea1bb5df9a6532599cf285";
        String requestUrl = "http://api.pdflayer.com/api/convert?access_key=b50217e305ea1bb5df9a6532599cf285  =" + accessKey + "&document_url=" + urlToConvert;

        try {
            URL url = new URL(requestUrl);
            InputStream in = url.openStream();
            Files.copy(in, Paths.get("converted.pdf"), StandardCopyOption.REPLACE_EXISTING);
            in.close();
            System.out.println("PDF saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
