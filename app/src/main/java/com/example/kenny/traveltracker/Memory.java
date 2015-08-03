package com.example.kenny.traveltracker;

import java.io.Serializable;

/**
 * Created by Kenny on 2015-07-21.
 */
public class Memory implements Serializable{
    long id;
    double latitude;
    double longitude;
    String city;
    String country;
    String notes;
}
