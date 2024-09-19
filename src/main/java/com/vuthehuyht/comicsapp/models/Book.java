package com.vuthehuyht.comicsapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "rating")
    private String rating;

    @Column(name = "progress")
    private String progress;

    @Column(name = "image_url", length = 1024)
    private String imageUrl;

    @Column(name = "is_picked")
    private boolean isPicked;

    @Column(name = "key_book")
    private String keyBook;

    @Column(name = "year")
    private String year;

    @ManyToOne
    @JoinColumn(name = "series_book_id", nullable = false)
    private SeriesBook seriesBook;

    @Column(name = "episode")
    private Integer episode;
}
