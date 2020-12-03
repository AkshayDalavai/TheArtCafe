package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.ImageURL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageURL,Integer> {
}
