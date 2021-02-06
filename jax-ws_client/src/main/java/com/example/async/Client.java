package com.example.async;

import com.example.soap.service.Monitor;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.util.concurrent.Future;

public class Client {
    public static class OurAsyncHandler implements AsyncHandler<Monitor> {

        private Monitor tMonitor;



        public String getResponse() {

            return tMonitor.toString();
        }



        public void handleResponse(Response<Monitor> res) {
            try {
                tMonitor = res.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MonitorServiceImplService service = new MonitorServiceImplService();
        MonitorService port = service.getMonitorServiceImplPort();
        Monitor m1 = new Monitor();
        m1.setId(1);
        m1.setName("SAMSUNG");
        m1.setDiagonal("32");
        m1.setPrice("$3000");
        port.addMonitor(m1);

        //
        OurAsyncHandler handler = new OurAsyncHandler();

        Future<?> response = port.getMonitorAsync(1, handler);
        while(!response.isDone()) {
            Thread.sleep(100);
        }

        String message = handler.getResponse();
        System.out.println("Service responded through callback with " + message);

        System.exit(0);
    }
}
