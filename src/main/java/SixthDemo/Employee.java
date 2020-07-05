package main.java.SixthDemo;

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private String name;
    private Set<String> devices;

    public void addDevices(String deviceName){
        if(this.devices==null){
            this.devices = new HashSet<>();
        }

        this.devices.add(deviceName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getDevices() {
        return devices;
    }

    public void setDevices(Set<String> devices) {
        this.devices = devices;
    }
}
