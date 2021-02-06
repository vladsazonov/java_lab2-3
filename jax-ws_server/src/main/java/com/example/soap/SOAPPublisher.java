package com.example.soap;

import com.example.soap.service.MonitorServiceImpl;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/monitors", new MonitorServiceImpl());
    }
}
