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
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String command = "";
        Network_System sys = new Network_System();
        System.out.println("Enter any of the following commands or Exit when done.");
        System.out.println("Add: to add an equipment");
        System.out.println("Find by mac: to search for an equipment by its mac address");
        System.out.println("Find by Serial Number");
        System.out.println("Update by ip address");
        System.out.println("Get last updated equipment");
        System.out.println("Get last connected equipment");
        System.out.println("Connect");
        System.out.println("Disconnect");
         System.out.println("view all the equipments ");
        
        do{
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter command: ");
            command = sc.nextLine();
            switch(command){
                case "Add":
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    if(name.equals("")){
                        System.out.println("Enter a valid name! ");
                        name = sc.nextLine();
                    }
                    System.out.println("Enter manufacturer");
                    String manufacturer = sc.nextLine();
                    if(manufacturer.equals("")){
                        System.out.println("Enter a valid manufacturer!");
                        manufacturer = sc.nextLine();
                    }
                    System.out.println("Enter model number");
                    String model_number = sc.nextLine();
                    if(model_number.equals("")){
                        System.out.println("Enter a valid model number.");
                        model_number = sc.nextLine();
                    }
                    System.out.println("Enter serial number");
                    String serial_number = sc.nextLine();
                    if(serial_number.equals("")){
                        System.out.println("Enter a valid serial number.");
                        serial_number = sc.nextLine();
                    }
                    System.out.println("Enter mac address");
                    String mac_address = sc.nextLine();
                    if(mac_address.equals("")){
                        System.out.println("Enter a valid mac address!");
                        mac_address = sc.nextLine();
                    }
                    System.out.println("Enter ip address");
                    String current_ip_address = sc.nextLine();
                    if(current_ip_address.equals("")){
                        System.out.println("Enter a valid IP address!");
                        current_ip_address = sc.nextLine();
                    }
                    System.out.println("Enter location");
                    String current_location = sc.nextLine();  
                    if(current_location.equals("")){
                        System.out.println("Enter a valid location.");
                        current_location = sc.nextLine();  
                    }
                    Equipment e = new Equipment(name,  manufacturer, model_number, serial_number, mac_address, current_ip_address, current_location);
                    sys.add_new_equipment(e);
                    break;
                case "Find by mac":
                    System.out.println("Enter mac");
                    String mac = sc.nextLine();
                    Equipment eq = sys.find_equipment_mac(mac);
                    if(eq==null){
                        System.out.println("This mac can't be found. Please enter a valid one in the next time.");
                    }else{
                        eq.print_equipment();
                    }
                    break;
                case "Find by Serial Number":
                    System.out.println("Enter Serial Number");
                    String serialNumber = sc.nextLine();
                    Equipment eq_1 = sys.find_equipment_serial (serialNumber);
                    if(eq_1==null){
                        System.out.println("This serial number can't be found. Please enter a valid one in the next time.");
                    }else{
                        eq_1.print_equipment();
                    }
                    break;
                case "Update by ip address":
                    System.out.println("Enter ip address");
                    String ip_address = sc.nextLine();
                    
                    System.out.println("Now you enter the following information.");
                    System.out.println("Enter name");
                    String new_name = sc.nextLine();
                    System.out.println("Enter manufacturer");
                    String new_manufacturer = sc.nextLine();
                    System.out.println("Enter model number");
                    String new_model_number = (sc.nextLine());
                    System.out.println("Enter serial number");
                    String new_serial_number = (sc.nextLine());
                    System.out.println("Enter mac address");
                    String new_mac_address = sc.nextLine();
                    System.out.println("Enter location");
                    String new_current_location = sc.nextLine();   
                    sys.update_equipment_by_ip_address(new_name, new_manufacturer, new_model_number, new_serial_number, new_mac_address, ip_address, new_current_location);
                    break;
                case "Get last updated equipment":
                    System.out.println("Last updated equipment: ");
                    sys.getLast_updated_device().print_equipment();
                    break;
                case "Get last connected equipment":
                    System.out.println("Last connected device 1: ");
                    sys.getLast_connected_device_1().print_equipment();
                    System.out.println("Last connected device 2: ");
                    sys.getLast_connected_device_2().print_equipment();
                    break;
                case "Connect":
                    System.out.println("Enter device 1 IP");
                    String ip_1 = sc.nextLine();
                    System.out.println("Enter device 2 IP");
                    String ip_2 = sc.nextLine();   
                    sys.connect_equipment_to_another(ip_1, ip_2);
                    break;
                case "Disconnect":
                    System.out.println("Enter device 1 IP");
                    String ip_1_ = sc.nextLine();
                    System.out.println("Enter device 2 IP");
                    String ip_2_ = sc.nextLine();   
                    sys.disconnect_equipments(ip_1_, ip_2_);
                    break;
                case "View":
                    sys.view();
                    break;
                case "Exit":
                    break;
                default:
                    System.out.println("Wrong command. Please enter a correct one");
            }
            
        }while(!command.equals("Exit"));
    }
    
}
