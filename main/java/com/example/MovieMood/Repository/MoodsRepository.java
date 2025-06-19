package com.example.MovieMood.Repository;

import com.example.MovieMood.Entity.Moods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoodsRepository extends JpaRepository<Moods,Long> {
}
