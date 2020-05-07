package com.jeremiahseagraves.designpatterns.structural.facade.usual;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.google.com");

        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}