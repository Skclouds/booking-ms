package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/hotelss")


    public String getData() {
        return"Please book your ticket in benguluru 49% discount";
    }
}
