package org.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private double co2ppm;
    private double copm;
    private double temperature;
    private double carbonKg;

    private LocalDateTime timestamp;

    public Long getId() { return id; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getCo2ppm() { return co2ppm; }
    public void setCo2ppm(double co2ppm) { this.co2ppm = co2ppm; }

    public double getCopm() { return copm; }
    public void setCopm(double copm) { this.copm = copm; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public double getCarbonKg() { return carbonKg; }
    public void setCarbonKg(double carbonKg) { this.carbonKg = carbonKg; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
