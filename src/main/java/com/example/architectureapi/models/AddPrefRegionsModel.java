package com.example.architectureapi.models;

import java.util.List;

public class AddPrefRegionsModel {
    List<Address> addresses;

    public static class Address{
        private String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
