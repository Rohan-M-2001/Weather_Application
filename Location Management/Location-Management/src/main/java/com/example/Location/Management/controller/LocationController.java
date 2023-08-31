package com.example.Location.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Location.Management.model.Location;
import com.example.Location.Management.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {
  private final LocationService locationService;

  @Autowired
  public LocationController(LocationService locationService) {

    this.locationService = locationService;
  }

  @GetMapping("/getlocations")
  public List<Location> getAllLocations() {

    return this.locationService.getAllLocations();
  }

  @PostMapping("/post")
  public Location addLocation(@RequestBody Location location) {

    return this.locationService.addLocation(location);
  }

  @DeleteMapping("/{id}")
  public void deleteLocation(@PathVariable Long id) {

    this.locationService.deleteLocation(id);
  }
}
