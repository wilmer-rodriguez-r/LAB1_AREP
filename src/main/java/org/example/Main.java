package org.example;

import java.net.*;
import java.io.*;
import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            URL siteURL = new URL("http://www.google.com:80/hola=23?adios=1#1234a");
            System.out.println(siteURL.getProtocol());
            System.out.println(siteURL.getAuthority());
            System.out.println(siteURL.getHost());
            System.out.println(siteURL.getPort());
            System.out.println(siteURL.getPath());
            System.out.println(siteURL.getQuery());
            System.out.println(siteURL.getFile());
            System.out.println(siteURL.getRef());
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}