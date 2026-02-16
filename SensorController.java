package org.example.controller;

import org.example.model.SensorData;
import org.example.repository.SensorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorRepository repo;

    public SensorController(SensorRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<SensorData> getAll(){
        return repo.findAll();
    }
}
