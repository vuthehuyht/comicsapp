package com.vuthehuyht.comicsapp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DataBookResponse(
        @JsonProperty("series_name") String seriesName,
        @JsonProperty("first_published_year") String firstPublishedYear,
        String author,
        @JsonProperty("cover_image_url") String coverImageUrl,
        @JsonProperty("is_popular") String isPopular,
        String description,
        String rating,
        String language,
        String episodes
) {
}
