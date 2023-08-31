package com.example.Location.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String countryCode;

  /**
   * @return id
   */
  public Long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(Long id) {

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return countryCode
   */
  public String getCountryCode() {

    return this.countryCode;
  }

  /**
   * @param countryCode new value of {@link #getcountryCode}.
   */
  public void setCountryCode(String countryCode) {

    this.countryCode = countryCode;
  }

  // Getters and setters
}
