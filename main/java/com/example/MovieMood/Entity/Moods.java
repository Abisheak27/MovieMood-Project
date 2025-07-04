package com.example.MovieMood.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Moods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moodId;

    private String Mood_name;
}
