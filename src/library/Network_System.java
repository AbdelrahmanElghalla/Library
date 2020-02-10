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
public class Network_System {
    private LinkedList<Equipment> equipment = new LinkedList<Equipment>(); 
    private Equipment last_connected_device_1;
    private Equipment last_connected_device_2;
    private Equipment last_updated_device;
    
    public void add_new_equipment(Equipment e){
        equipment.add(e);
    }
    public Equipment find_equipment_mac(String mac){
        for(Equipment e : equipment){ 
            if(e.getMac_address().equals(mac)){
                return e;
            }
        }
        return null;
    }
    public Equipment find_equipment_serial(String serial){
        for(Equipment e : equipment){
            if(e.getSerial_number() == serial){
                return e;
            }
        }
        return null;
    }

    public void update_equipment_by_ip_address(String name, String manufacturer, String model_number, String serial_number, String mac_address, String current_ip_address, String current_location){
        Equipment k = null;
        for(Equipment e : equipment){
            if(e.getCurrent_ip_address().equals(current_ip_address)){
                k=e;
            }
        }
        if(k==null){
            System.out.println("Ip address can't be found. PLease enter a correct one in the next time.");
            return;
        }
        k.setName(name);
        k.setManufacturer(manufacturer);
        k.setModel_number(model_number);
        k.setSerial_number(serial_number);
        k.setMac_address(mac_address);
        k.setCurrent_location(current_location);
        last_updated_device = k;
    }
    
    public void connect_equipment_to_another(String ip_1, String ip_2){
        
        Equipment k_1 = null;
        Equipment k_2 = null;
        
        for(Equipment e: equipment){
            if(e.getCurrent_ip_address().equals(ip_1)){
                    k_1 = e;
            }
        }
        for(Equipment e: equipment){
            if(e.getCurrent_ip_address().equals(ip_1)){
                    k_2 = e;
            }
        }
        if(k_1==null | k_2==null){
            System.out.println("One of the IP adresses doesn't exist. Please eneter correct IPs in the next time.");
            return;
        }
        
        k_1.getConnections().add(k_2);
        k_2.getConnections().add(k_1);
        last_connected_device_1 = k_1;
        last_connected_device_2 = k_2;
        System.out.println("Devices connected successfully.");
    }
    
    public void disconnect_equipments(String ip_1, String ip_2){
        Equipment k_1 = null;
        Equipment k_2 = null;
        
        for(Equipment e: equipment){
            if(e.getCurrent_ip_address().equals(ip_1)){
                    k_1 = e;
            }
        }
        for(Equipment e: equipment){
            if(e.getCurrent_ip_address().equals(ip_1)){
                    k_2 = e;
            }
        }
        if(k_1==null | k_2==null){
            System.out.println("One of the IP adresses doesn't exist. Please enter corrrect IPs in the next time.");
            return;
        }
        

        k_1.getConnections().remove(k_2);
        k_2.getConnections().remove(k_1);        
        System.out.println("Devices disconnected successfully.");
    }
    
    public LinkedList<Equipment> get_all_equipment(){
        return equipment;
    }
    
    public LinkedList<Equipment> all_current_equipment(String location){
        LinkedList<Equipment> current_equipment = new LinkedList<Equipment>();
        for(Equipment e : equipment){
            if(e.getCurrent_location().equals(location)){
                current_equipment.add(e);
            }
        }
        return current_equipment;
    }

    public LinkedList<Equipment> all_previous_equipment(String location){
        LinkedList<Equipment> previous_equipment = new LinkedList<Equipment>();
        for(Equipment e : equipment){
            if(e.getPrevious_location().equals(location)){
                previous_equipment.add(e);
            }
        }
        return previous_equipment;
    }

    public Equipment getLast_connected_device_1() {
        return last_connected_device_1;
    }

    public Equipment getLast_connected_device_2() {
        return last_connected_device_2;
    }

    public Equipment getLast_updated_device() {
        return last_updated_device;
    }
    public void view(){
        for(Equipment e: equipment){
            e.print_equipment();
        }
    }
    
    
    
    
    
    
    
}
