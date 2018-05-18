package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Shipwreck;

// since I want it to be a spring data repository 
//we add extends JpaRepository<Shipwreck, long>
// which take Shipwreck entity and the primary key of long

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
