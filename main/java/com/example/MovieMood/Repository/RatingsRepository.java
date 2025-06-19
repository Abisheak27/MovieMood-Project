package com.example.MovieMood.Repository;

import com.example.MovieMood.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingsRepository extends JpaRepository<Rating, Long> {
}
