package com.example.base.controller;

import com.example.base.service.IVehicleService;
import com.example.base.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehicleController {

    private final IVehicleService vehicleService;

    @Autowired
    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/vehicles")
    public List<Vehicle> get() {
        return vehicleService.getAll();
    }

    @PostMapping("/vehicles/add")
    public String addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.add(vehicle);
        return "Vehicle added successfully!";
    }

    @PutMapping("/vehicles/update")
    public String updateVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.update(vehicle);
        return "Vehicle updated successfully!";
    }

    @DeleteMapping("/vehicles/delete/id={idNumber}")
    public String deleteVehicle(@PathVariable int idNumber) {
        vehicleService.delete(idNumber);
        return "Vehicle deleted successfully!";
    }

    @GetMapping("/vehicles/id={idNumber}")
    public Vehicle findVehicleById(@PathVariable int idNumber) {
        return vehicleService.findById(idNumber);
    }
}