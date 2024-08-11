package com.vuthehuyht.comicsapp.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BookResponse(
        Long id,
        String name,
        String author,
        String rating,
        String progress,
        @JsonProperty("image_url") String imageUrl,
        @JsonProperty("is_picked") boolean isPicked,
        @JsonProperty("key_book") String keyBook,
        String year
) {
}
