package com.fallkey.fk_booster_example_backend.repository;

import com.fallkey.fk_booster_example_backend.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
