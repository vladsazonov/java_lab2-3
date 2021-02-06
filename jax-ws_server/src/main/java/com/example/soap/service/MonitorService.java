package com.example.soap.service;

import com.example.soap.entity.Monitor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MonitorService {


    @WebMethod
    public boolean addMonitor(Monitor p);

    @WebMethod
    public boolean deleteMonitor(int id);

    @WebMethod
    public Monitor getMonitor(int id);

    @WebMethod
    public Monitor[] getAllMonitors();

}
