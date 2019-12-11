/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sha2ety;

/**
 *
 * @author bibo_121
 */
public class Account {
 
    private String F_Name;
    private String LName;
    private int id;
    private String Address;
    private String Gender;
    private String phoneNumber;
    private String Email;
    private String username;
    private String password;

    
    
    public Account(String F_Name, String LName, int id, String Address, String Gender, String phoneNumber, String Email, String username, String password) {
        this.F_Name = F_Name;
        this.LName = LName;
        this.id = id;
        this.Address = Address;
        this.Gender = Gender;
        this.phoneNumber = phoneNumber;
        this.Email = Email;
        this.username = username;
        this.password = password;
    }

    
  
    
    public String getF_Name() {
        return F_Name;
    }

    public void setF_Name(String F_Name) {
        this.F_Name = F_Name;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
