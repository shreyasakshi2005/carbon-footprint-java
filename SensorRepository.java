package org.example.repository;

import org.example.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository
        extends JpaRepository<SensorData, Long> {
}
