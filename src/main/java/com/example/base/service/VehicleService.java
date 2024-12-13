package com.example.base.service;

import com.example.base.datamodel.IVehicleRepository;
import com.example.base.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService {

    private final IVehicleRepository iVehicleRepository;

    @Autowired
    public VehicleService(IVehicleRepository iVehicleRepository) {
        this.iVehicleRepository = iVehicleRepository;
    }

    @Override
    public List<Vehicle> getAll() {
        return iVehicleRepository.getAll();
    }

    @Override
    public void add(Vehicle vehicle) {
        iVehicleRepository.add(vehicle);
    }

    @Override
    public void update(Vehicle vehicle) {
        iVehicleRepository.update(vehicle);
    }

    @Override
    public void delete(int id) {
        iVehicleRepository.delete(id);
    }

    @Override
    public Vehicle findById(int id) {
        return iVehicleRepository.findById(id);
    }
}
