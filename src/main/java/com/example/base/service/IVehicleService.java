package com.example.base.service;

import com.example.base.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> getAll();
    void add(Vehicle vehicle);
    void update(Vehicle vehicle);
    void delete(int id);
    Vehicle findById(int id);
}
