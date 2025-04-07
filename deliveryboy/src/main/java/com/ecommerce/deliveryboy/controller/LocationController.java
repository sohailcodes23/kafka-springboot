package com.ecommerce.deliveryboy.controller;

import com.ecommerce.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("locations")
public class LocationController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping
    public ResponseEntity updateLocation() {
        System.out.println("INN");
        for (int i = 1; i <= 10; i++) {
            kafkaService.updateLocation("Location " + i + " " + Math.random() * 100);
        }
        System.out.println("OUT");
        return ResponseEntity.ok(Map.of("message", "Location updated"));
    }

    @PostMapping("employee")
    public ResponseEntity sendEmployee() {
        System.out.println("INN");
        for (int i = 1; i <= 1; i++) {
            kafkaService.sendEmployee((int) (Math.random() * 100));
        }
        System.out.println("OUT");
        return ResponseEntity.ok(Map.of("message", "employee updated"));
    }
}
