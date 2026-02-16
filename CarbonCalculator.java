package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class CarbonCalculator {

    public double calculateCO2Kg(double ppm,
                                 double volumeM3){

        double mgPerM3 = (ppm * 44) / 24.45;

        return (mgPerM3 * volumeM3) / 1_000_000;
    }
}
