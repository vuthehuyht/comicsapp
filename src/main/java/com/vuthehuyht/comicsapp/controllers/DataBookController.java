package com.vuthehuyht.comicsapp.controllers;

import com.vuthehuyht.comicsapp.responses.ApiResponse;
import com.vuthehuyht.comicsapp.responses.DataBookResponse;
import com.vuthehuyht.comicsapp.services.DataBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/data-books")
@RequiredArgsConstructor
public class DataBookController {
    private final DataBookService dataBookService;

    @GetMapping
    ApiResponse<List<DataBookResponse>> getAllDataBook() {
        return ApiResponse.<List<DataBookResponse>>builder()
                .code(HttpStatus.OK.value())
                .data(dataBookService.getAllDataBook())
                .build();
    }
}
