package com.fallkey.fk_booster_example_backend.service;

import com.fallkey.fk_booster_example_backend.entity.Property;
import com.fallkey.fk_booster_example_backend.repository.PropertyRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public Property create(Property property) {
        return propertyRepository.save(property);
    }

    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    public Property findById(Long id) {
        return propertyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Property not found with id: " + id));
    }

    public Property update(Long id, Property updatedProperty) {
        Property existingProperty = findById(id);
        
        existingProperty.setType(updatedProperty.getType());
        existingProperty.setDescription(updatedProperty.getDescription());
        existingProperty.setCep(updatedProperty.getCep());
        existingProperty.setAddress(updatedProperty.getAddress());
        existingProperty.setCity(updatedProperty.getCity());
        existingProperty.setState(updatedProperty.getState());
        existingProperty.setCountry(updatedProperty.getCountry());
        
        return propertyRepository.save(existingProperty);
    }

    public void delete(Long id) {
        Property property = findById(id);
        propertyRepository.delete(property);
    }
}
