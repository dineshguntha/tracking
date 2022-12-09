package com.example.demo.controller;

import com.example.demo.model.Tracking;
import com.example.demo.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TrackingController {

    @Autowired
    private TrackingRepository trackingRepository;
    @GetMapping("/tracking/{id}")
    public Tracking fetchTracking(@PathVariable("id") Integer id) {
       Optional<Tracking> tracking = trackingRepository.findById(id);
        if (tracking.isPresent()) {
            return tracking.get();
        } else {
           return null;
        }

    }

    @GetMapping("/")
    public String helloWolrd() {
        return "hello world";
    }
}
