package com.example.addressbookspring.entity;

import com.example.addressbookspring.dto.AddressBookDTO;

import javax.persistence.*;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullName;
    private long phoneNumber;

    private String zip;
    private String city;
    private String state;
    private String address;
public AddressBook(){}
    public AddressBook(AddressBookDTO addressBookDTO) {
        this.fullName = addressBookDTO.getFullName();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.zip = addressBookDTO.getZip();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.address = addressBookDTO.getAddress();
    }

    public AddressBook(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.fullName = addressBookDTO.getFullName();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.zip = addressBookDTO.getZip();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.address = addressBookDTO.getAddress();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String email) {
        this.zip = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
