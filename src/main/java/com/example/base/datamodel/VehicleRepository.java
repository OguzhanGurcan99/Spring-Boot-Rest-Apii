package com.example.base.datamodel;

import com.example.base.entity.Vehicle;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class VehicleRepository implements IVehicleRepository {

    private final EntityManager entityManager;

    @Autowired
    public VehicleRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Vehicle> getAll() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from Vehicle ";
        List<Vehicle> vehicles = session.createQuery(query,Vehicle.class).getResultList();
        return vehicles;
    }

    @Override
    @Transactional
    public void add(Vehicle vehicle) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(vehicle);
    }

    @Override
    @Transactional
    public void update(Vehicle vehicle) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(vehicle);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(id);
    }

    @Override
    @Transactional
    public Vehicle findById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Vehicle vehicle = session.get(Vehicle.class, id);
        return vehicle;
    }
}
