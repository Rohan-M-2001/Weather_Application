package com.example.Location.Management.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Location.Management.model.Location;
import com.example.Location.Management.repository.LocationRepository;

@Service
public class LocationService {
  private final LocationRepository locationRepository;

  @Autowired
  public LocationService(LocationRepository locationRepository) {

    this.locationRepository = locationRepository;
  }

  public List<Location> getAllLocations() {

    return this.locationRepository.findAll();
  }

  public Location addLocation(Location location) {

    return this.locationRepository.save(location);
  }

  public void deleteLocation(Long locationId) {

    this.locationRepository.deleteById(locationId);
  }
}
