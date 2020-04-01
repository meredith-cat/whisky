package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findWhiskyByYear(int year);

//    Get all the whisky from a particular distillery that’s a specific age

    List<Whisky> findWhiskyByDistilleryIdAndAge(Long id, int age);

    List<Whisky> findWhiskyByDistilleryRegion(String region);

}
