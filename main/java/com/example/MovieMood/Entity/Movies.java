package com.example.MovieMood.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Movie_id")
    private long movieId;

    private String Movie_Title;

    private String Movie_Description;

    private int Movie_Release_Year;

    private String Movie_Image_Url;



}
