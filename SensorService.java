package org.example.service;

import org.example.model.SensorData;
import org.example.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SensorService {

    private final SensorRepository repo;
    private final CarbonCalculator calc;

    public SensorService(SensorRepository repo,
                         CarbonCalculator calc){
        this.repo = repo;
        this.calc = calc;
    }

    public void saveData(String location,
                         double co2,
                         double co,
                         double temp){

        SensorData data = new SensorData();

        data.setLocation(location);
        data.setCo2ppm(co2);
        data.setCopm(co);
        data.setTemperature(temp);

        double carbon =
                calc.calculateCO2Kg(co2,1500);

        data.setCarbonKg(carbon);
        data.setTimestamp(LocalDateTime.now());

        repo.save(data);
    }
}
