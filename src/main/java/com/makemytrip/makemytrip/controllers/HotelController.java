package com.makemytrip.makemytrip.controllers;

import com.makemytrip.makemytrip.models.Hotel;
import com.makemytrip.makemytrip.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@CrossOrigin(origins = "*")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    public String getHotels() {
        return "API WORKING";
    }
}