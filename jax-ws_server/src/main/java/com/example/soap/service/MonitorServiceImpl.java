package com.example.soap.service;

import com.example.soap.entity.Monitor;
import com.example.soap.service.MonitorService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebService(endpointInterface = "com.example.soap.service.MonitorService")
public class MonitorServiceImpl implements MonitorService {

    private static Map<Integer, Monitor> monitors = new HashMap<Integer, Monitor>();

    @Override
    public boolean addMonitor(Monitor p) {
        try {
            Thread.sleep(3000);
            if (monitors.get(p.getId()) != null) return false;
            monitors.put(p.getId(), p);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteMonitor(int id) {
        try {
            Thread.sleep(2000);
            if (monitors.get(id) == null) return false;
            monitors.remove(id);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Monitor getMonitor(int id) {
        try {
            Thread.sleep(2000);
            return monitors.get(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Monitor[] getAllMonitors() {
        try {
            Thread.sleep(20000);
            Set<Integer> ids = monitors.keySet();
            Monitor[] p = new Monitor[ids.size()];
            int i = 0;
            for (Integer id : ids) {
                p[i] = monitors.get(id);
                i++;
            }
            return p;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

