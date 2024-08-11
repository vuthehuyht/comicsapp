package com.vuthehuyht.comicsapp.services;

import com.vuthehuyht.comicsapp.responses.BookResponse;

import java.util.List;

public interface BookService {
    BookResponse getBookByEpisodeAndDataBookId(Integer episode, Long dataBookId);

    List<BookResponse> getBooksByDataBookId(Long dataBookId);
}
