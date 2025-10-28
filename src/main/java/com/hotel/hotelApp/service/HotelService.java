package com.hotel.hotelApp.service;

import com.hotel.hotelApp.enitity.Hotel;
import com.hotel.hotelApp.repository.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
	
	@Autowired
    private final HotelRepository repo;

    public HotelService(HotelRepository repo) {
        this.repo = repo;
    }

    public List<Hotel> getAllHotels() {
        return repo.findAll();
    }
    

    // Save hotel to DB
    public Hotel saveHotel(Hotel hotel) {
        return repo.save(hotel);
    }
    
    // Update hotel
    public Hotel updateHotel(Long id, Hotel hotelDetails) {
        hotelDetails.setId(id);
        return repo.save(hotelDetails);
    }

    // Delete hotel
    public void deleteHotel(Long id) {
        repo.deleteById(id);
    }

}
