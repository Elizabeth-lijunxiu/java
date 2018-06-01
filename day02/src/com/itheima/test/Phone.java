package com.itheima.test;

public class Phone {
    private String brand;
    private String system;
    private String manufacturer;

    public Phone() {
    }

    public Phone(String brand, String system, String manufacturer) {
        this.brand = brand;
        this.system = system;
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
