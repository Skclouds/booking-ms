package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")


    public String getData() {
        return"Please book your flight ticket in benguluru 15% discount";
    }
}
