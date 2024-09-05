package com.vuthehuyht.comicsapp.controllers;

import com.vuthehuyht.comicsapp.responses.ApiResponse;
import com.vuthehuyht.comicsapp.responses.SeriesBookResponse;
import com.vuthehuyht.comicsapp.services.SeriesBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/series-books")
@RequiredArgsConstructor
public class DataBookController {
    private final SeriesBookService dataBookService;

    @GetMapping
    ApiResponse<List<SeriesBookResponse>> getAllDataBook() {
        return ApiResponse.<List<SeriesBookResponse>>builder()
                .code(HttpStatus.OK.value())
                .data(dataBookService.getAllDataBook())
                .build();
    }
}
