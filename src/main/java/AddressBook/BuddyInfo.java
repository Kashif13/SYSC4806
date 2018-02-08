package AddressBook;

import javax.persistence.*;
@Entity
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    private Long id;

    private AddressBook addressBook;


    public BuddyInfo() {
    }

    public BuddyInfo(String name){
        this.name = name;
        this.address = "";
        this.phoneNumber = "";
    }

    public BuddyInfo(String name, String addr){
        this.name = name;
        this.address = addr;
        this.phoneNumber = "";
    }

    public BuddyInfo(String name, String addr, String num){
        this.name = name;
        this.address = addr;
        this.phoneNumber = num;
    }



    /***************GETTERS****************************/
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    @ManyToOne
    public AddressBook getAddressBook() {
        return addressBook;
    }

    /***************SETTERS****************************/
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phone){
        this.phoneNumber = phone;
    }
    public void setId(Long buddyID) {
        this.id = buddyID;
    }

    public void setAddressBook(AddressBook addressBook){
        this.addressBook = addressBook;
    }

    @Override
    public String toString(){
        return "BuddyID: " +this.getId() + ", Name: " +this.name + ", Address: " + this.address + ", Phone Number: " + this.phoneNumber;
    }
}