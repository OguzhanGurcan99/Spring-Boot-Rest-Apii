package com.example.base.datamodel;

import com.example.base.entity.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    List<Vehicle> getAll();
    void add(Vehicle vehicle);
    void update(Vehicle vehicle);
    void delete(int id);
    Vehicle findById(int id);

}
