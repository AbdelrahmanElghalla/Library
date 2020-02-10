/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.*; 
/**
 *
 * @author dell
 */
public class Equipment {
    private String name;
    private String manufacturer;
    private String model_number;
    private String serial_number;
    private String mac_address;
    private String current_ip_address;
    private String previous_ip_address;
    private String current_location;
    private String previous_location;
    private LinkedList<Equipment> connections = new LinkedList<Equipment>(); 

    public Equipment(String name, String manufacturer, String model_number,  String serial_number, String mac_address, String current_ip_address, String current_location) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.model_number = model_number;
        this.serial_number = serial_number;
        this.mac_address = mac_address;
        this.current_ip_address = current_ip_address;
        this.current_location = current_location;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public void setMac_address(String mac_address) {
        this.mac_address = mac_address;
    }

    public void setCurrent_ip_address(String current_ip_address) {
        this.current_ip_address = current_ip_address;
    }

    public void setPrevious_ip_address(String previous_ip_address) {
        this.previous_ip_address = previous_ip_address;
    }

    public void setCurrent_location(String current_location) {
        this.current_location = current_location;
    }

    public void setPrevious_location(String previous_location) {
        this.previous_location = previous_location;
    }

    public void setConnections(LinkedList<Equipment> connections) {
        this.connections = connections;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel_number() {
        return model_number;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public String getMac_address() {
        return mac_address;
    }

    public String getCurrent_ip_address() {
        return current_ip_address;
    }

    public String getPrevious_ip_address() {
        return previous_ip_address;
    }

    public String getCurrent_location() {
        return current_location;
    }

    public String getPrevious_location() {
        return previous_location;
    }

    public LinkedList<Equipment> getConnections() {
        return connections;
    }
    
    public void print_equipment(){
        System.out.println("Name: " +  name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model number: " + model_number);
        System.out.println("Serial Number: " + serial_number);
        System.out.println("Mac Address: " + mac_address);
        System.out.println("Current Ip Address: " + current_ip_address);
        System.out.println("Previous Ip Address: " + previous_ip_address);
        System.out.println("Current Location: " + current_location);
        System.out.println("Previous Location: " + previous_location);
    }
    
    
    
}
