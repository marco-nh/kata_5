/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5_is2;

/**
 *
 * @author usuario
 */
public class Person {
    private String name;
    
    private String address;
    
    private String email;
    
    public Person (String name, String address, String email){
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getEmailDomain () {
        if(isMail(this.getEmail())){
            return this.getEmail().substring(this.email.indexOf("@")+1, this.email.length());
        } 
        return "Not Valid/Unknown";
    }
    
}
