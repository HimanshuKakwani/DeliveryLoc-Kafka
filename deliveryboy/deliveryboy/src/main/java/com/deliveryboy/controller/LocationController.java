package com.deliveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.service.KafkaService;
// import io.advantageous.qbit.kafka.KafkaService;

// what is rest controller and how does request mapping work
@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    // what is post mapping and response entity?
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        for (int i = 1; i <= 10000; i++) {
            this.kafkaService.updateLocation("(" + Math.random() * 100 + ", " + Math.random() * 100 + ")");
        }
        return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }

}
