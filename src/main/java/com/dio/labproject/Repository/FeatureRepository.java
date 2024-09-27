package com.dio.labproject.Repository;

import com.dio.labproject.Models.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
