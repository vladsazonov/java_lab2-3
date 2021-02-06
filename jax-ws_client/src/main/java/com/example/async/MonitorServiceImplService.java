
package com.example.async;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MonitorServiceImplService", targetNamespace = "http://service.soap.example.com/", wsdlLocation = "http://localhost:8888/ws/monitors?wsdl")
public class MonitorServiceImplService
    extends Service
{

    private final static URL MONITORSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MONITORSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MONITORSERVICEIMPLSERVICE_QNAME = new QName("http://service.soap.example.com/", "MonitorServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/ws/monitors?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MONITORSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MONITORSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MonitorServiceImplService() {
        super(__getWsdlLocation(), MONITORSERVICEIMPLSERVICE_QNAME);
    }

    public MonitorServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MONITORSERVICEIMPLSERVICE_QNAME, features);
    }

    public MonitorServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MONITORSERVICEIMPLSERVICE_QNAME);
    }

    public MonitorServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MONITORSERVICEIMPLSERVICE_QNAME, features);
    }

    public MonitorServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MonitorServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MonitorService
     */
    @WebEndpoint(name = "MonitorServiceImplPort")
    public MonitorService getMonitorServiceImplPort() {
        return super.getPort(new QName("http://service.soap.example.com/", "MonitorServiceImplPort"), MonitorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MonitorService
     */
    @WebEndpoint(name = "MonitorServiceImplPort")
    public MonitorService getMonitorServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.soap.example.com/", "MonitorServiceImplPort"), MonitorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MONITORSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MONITORSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MONITORSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
