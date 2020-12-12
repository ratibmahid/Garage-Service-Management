/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author Hp
 */
public class Serviceinformation {
    
    private String service_type;
    private String vehicle_type;

    public String getService_type() {
        return service_type;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public Serviceinformation(String service_type, String vehicle_type) {
        this.service_type = service_type;
        this.vehicle_type = vehicle_type;
    }
    
    
    
}
