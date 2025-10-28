 
    package com.hotel.hotelApp.controller;

    import com.hotel.hotelApp.enitity.Hotel;
    import com.hotel.hotelApp.service.HotelService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/hotels")
    @CrossOrigin(origins  = "http://localhost:3000")
    public class HotelController {

        @Autowired
        private final HotelService service;

        public HotelController(HotelService service) {
            this.service = service;
        }

        // GET all hotels
        @GetMapping
        public List<Hotel> getHotels() {
            return service.getAllHotels();
        }

        // POST
        @PostMapping
        public Hotel addHotel(@RequestBody Hotel hotel) {
            return service.saveHotel(hotel);
        }

        // PUT
        @PutMapping("/{id}")
        public Hotel updateHotel(@PathVariable Long id, @RequestBody Hotel hotelDetails) {
            return service.updateHotel(id, hotelDetails);
        }

        // DELETE
        @DeleteMapping("/{id}")
        public String deleteHotel(@PathVariable Long id) {
            service.deleteHotel(id);
            return "Hotel with ID " + id + " deleted successfully.";
}
    }
