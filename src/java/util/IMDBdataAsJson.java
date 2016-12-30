/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author Uditha Jay
 */
public class IMDBdataAsJson {
    public static String getIMDBdataFromURL(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        String imdbData = "";
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            imdbData += new String(buffer, 0, count);
        }
        bis.close();
        return imdbData;
    }
}
