package com.example.Location.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Location.Management.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
  // Additional query methods can be defined here
  Location findByName(String name); // Find a location by its name

  Location findByCountryCode(String countryCode);
}
