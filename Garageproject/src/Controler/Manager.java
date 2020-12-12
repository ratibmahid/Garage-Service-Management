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
public class Manager extends user {
     private String manager_id;

    public Manager(String Fullname, String Username, String Password) {
        super(Fullname, Username, Password);
        
    }

    public Manager(String manager_id, String Fullname, String Username, String Password) {
        super(Fullname, Username, Password);
        this.manager_id = manager_id;
    }

    public String getManager_id() {
        return manager_id;
    }

    @Override
    public boolean login(String Username, String Password) {
        return super.login(Username, Password); 
    }

    @Override
    public void register(String Fullname, String Username, String Password) {
        super.register(Fullname, Username, Password); 
    }
}
