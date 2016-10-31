package se.lemv.repository;

import org.springframework.data.repository.CrudRepository;

import se.lemv.model.ParkingSpot;

public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {

}
