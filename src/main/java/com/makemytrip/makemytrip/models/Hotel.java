package com.makemytrip.makemytrip.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

@Document(collection = "hotels")
public class Hotel {

    @Id
    private ObjectId id;

    private String hotelName;
    private String location;
    private double pricePerNight;
    private int availableRooms;
    private String amenities;

    // ✅ GET ID AS STRING (for frontend)
    public String getId() {
        return id != null ? id.toHexString() : null;
    }

    // ✅ SET ID AS OBJECTID
    public void setId(ObjectId id) {
        this.id = id;
    }

    // OTHER GETTERS & SETTERS

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }
}