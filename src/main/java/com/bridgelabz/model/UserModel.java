package com.bridgelabz.model;

import com.opencsv.bean.CsvBindByName;

public class UserModel {
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String city;
    @CsvBindByName
    private String country;

    public UserModel()
    {

    }

    public UserModel(String name,String city,String country)
    {
        this.name=name;
        this.city=city;
        this.country=country;

    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
