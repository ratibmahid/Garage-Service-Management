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
public class Client extends user {
    private String Email;
    private String Phone_Number;
    private String Servicing_name ;
    private String Vehicle_Number;
    private String Service_Date;
    private String License_number;
    private String Colour_name;
    private String Washing_material;

    public Client(String Fullname, String Username, String Password) {
        super(Fullname, Username, Password);
    }

    public Client(String Email, String Phone_Number, String Servicing_name, String Vehicle_Number, String Service_Date, String License_number, String Colour_name, String Washing_material, String Fullname, String Username, String Password) {
        super(Fullname, Username, Password);
        this.Email = Email;
        this.Phone_Number = Phone_Number;
        this.Servicing_name = Servicing_name;
        this.Vehicle_Number = Vehicle_Number;
        this.Service_Date = Service_Date;
        this.License_number = License_number;
        this.Colour_name = Colour_name;
        this.Washing_material = Washing_material;
    }
    

    public String getEmail() {
        return Email;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getLicense_number() {
        return License_number;
    }

    public String getServicing_name() {
        return Servicing_name;
    }

    public String getVehicle_Number() {
        return Vehicle_Number;
    }

    public String getService_Date() {
        return Service_Date;
    }

    public String getColour_name() {
        return Colour_name;
    }

    public String getWashing_material() {
        return Washing_material;
    }
    
    
     void insert_Washing(String Vehicle_Number, String License_number, String Washing_material, String Service_Date )
    {
        this.Vehicle_Number=Vehicle_Number;
        this.License_number= License_number;
        this.Washing_material=Washing_material;
        this.Service_Date=Service_Date;
    }
     void insert_painting(String Vehicle_Number, String License_number, String Colour_name, String Service_Date )
    {
        this.Vehicle_Number=Vehicle_Number;
        this.License_number= License_number;
        this.Colour_name=Colour_name;
        this.Service_Date=Service_Date;
    }
      void insert_servicing(String Vehicle_Number, String License_number, String Servicing_name, String Service_Date )
    {
        this.Vehicle_Number=Vehicle_Number;
        this.License_number= License_number;
        this.Servicing_name=Servicing_name;
        this.Service_Date=Service_Date;
    }
      
    
}
