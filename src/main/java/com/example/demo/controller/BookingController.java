package com.example.demo.controller;

import com.example.demo.dto.BookingDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/bookings")
public class BookingController {


    @PostMapping
    public BookingDto create(@Valid BookingDto bookingDto) {
        return bookingDto;
    }


}