package com.vuthehuyht.comicsapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "data_book")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeriesBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "series_name")
    private String seriesName;

    @Column(name = "first_published_year")
    private String firstPublishedYear;

    @OneToMany(mappedBy = "dataBook")
    private Set<Book> bookList;

    @Column(name = "author")
    private String author;

    @Column(name = "cover_image_url")
    private String coverImageUrl;

    @Column(name = "is_popular")
    private String isPopular;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private String rating;

    @Column(name = "language")
    private String language;

    @Column(name = "episodes")
    private String episodes;
}
