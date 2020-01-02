package com.kodilla.exception.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(){
        System.out.println("Flight not found");
    }
}
