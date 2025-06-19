package com.example.MovieMood.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "favorites")
public class Favorites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long favorite_id;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "Movie-id")
    private Movies movies;

}
