
package Controler;

public class user {
    
private String Fullname;
private String Username;
private String Password;

    public user(String Fullname, String Username, String Password) {
        this.Fullname = Fullname;
        this.Username = Username;
        this.Password = Password;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    public void register(String Fullname, String Username, String Password)
    {
        this.Fullname=Fullname;
        this.Password=Password;
        this.Username=Username;
        
    }
 
    public boolean  login(String Username, String Password)
    {
        System.out.println("Test authentic "+Fullname+", "+Username+","+Password);
        
        boolean flag;
        
        if (Username.equalsIgnoreCase(this.Username) && Password.equals(this.Password))
            flag=true;
        else
            flag=false;
       return flag;
   
    }
}
   