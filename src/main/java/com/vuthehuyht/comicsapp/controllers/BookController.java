package com.vuthehuyht.comicsapp.controllers;

import com.vuthehuyht.comicsapp.responses.ApiResponse;
import com.vuthehuyht.comicsapp.responses.BookResponse;
import com.vuthehuyht.comicsapp.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
@RequiredArgsConstructor
public class BookController {
    final private BookService bookService;

    @GetMapping(path = "/:dataBookId/book/:episode")
    ApiResponse<BookResponse> getBookByEpisodeAndDataBookId(
            @PathVariable Integer episode,
            @PathVariable Long dataBookId
    ) {
        return ApiResponse.<BookResponse>builder()
                .code(HttpStatus.OK.value())
                .data(bookService.getBookByEpisodeAndDataBookId(episode, dataBookId))
                .build();
    }

    @GetMapping(path = "/:dataBookId/books")
    ApiResponse<List<BookResponse>> getAllBookByDataBookId(@PathVariable Long dataBookId) {
        return ApiResponse.<List<BookResponse>>builder()
                .code(HttpStatus.OK.value())
                .data(bookService.getBooksByDataBookId(dataBookId))
                .build();
    }
}
