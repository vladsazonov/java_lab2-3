package com.example.soap;

import com.example.soap.entity.Monitor;
import com.example.soap.service.MonitorService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class SOAPPClient {
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8888/ws/monitors?wsdl");

        QName qname = new QName("http://jax-ws_server.example.com/", "MonitorServiceImpService");

        Service service = Service.create(wsdlURL, qname);


        MonitorService ms = service.getPort(MonitorService.class);

        Monitor m1 = new Monitor();
        m1.setName("DELL");
        m1.setId(1);
        m1.setDiagonal("24");
        m1.setPrice("$300");
        Monitor m2 = new Monitor();
        m1.setName("LG");
        m1.setId(2);
        m1.setDiagonal("24");
        m1.setPrice("$300");


        System.out.println("Add Monitor Status=" + ms.addMonitor(m1));
        System.out.println("Add Monitor Status=" + ms.addMonitor(m2));

        //get monitor
        System.out.println(ms.getMonitor(1));

        //get all monitors
        System.out.println(Arrays.asList(ms.getAllMonitors()));

        //delete monitors
        System.out.println("Delete monitor by id(Status)=" + ms.deleteMonitor(2));

        //get all monitors
        System.out.println(Arrays.asList(ms.getAllMonitors()));

    }

}
