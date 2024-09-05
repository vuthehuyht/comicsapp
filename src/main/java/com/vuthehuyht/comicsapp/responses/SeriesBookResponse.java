package com.vuthehuyht.comicsapp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SeriesBookResponse(
        @JsonProperty("series_name") String seriesName,
        @JsonProperty("first_published_year") String firstPublishedYear,
        String author,
        @JsonProperty("cover_image_url") String coverImageUrl,
        @JsonProperty("is_popular") String isPopular,
        String description,
        Double rating,
        String language,
        Integer episodes
) {
}
