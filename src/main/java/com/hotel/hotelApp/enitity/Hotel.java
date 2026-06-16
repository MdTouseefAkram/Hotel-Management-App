package com.hotel.hotelApp.enitity;


import jakarta.persistence.*;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private Double price;

    public Hotel() {}

    public Hotel(String name, String city, Double price) {
        this.name = name;
        this.city = city;
        this.price = price;
    }

    // Getters & Setters
    public Long getId() { 
    	return id; 
    }
    public void setId(Long id) { 
    	this.id = id; 
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    public String getCity() { 
    	return city; 
    }
    public void setCity(String city) { 
    	this.city = city; 
    }

    public Double getPrice() { 
    	return price; 
    }
    public void setPrice(Double price) { this.price = price; }
}

