package com.vuthehuyht.comicsapp.services.impl;

import com.vuthehuyht.comicsapp.models.SeriesBook;
import com.vuthehuyht.comicsapp.repositories.SeriesBookRepository;
import com.vuthehuyht.comicsapp.responses.SeriesBookResponse;
import com.vuthehuyht.comicsapp.services.SeriesBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataBookServiceImpl implements SeriesBookService {
    private final SeriesBookRepository dataBookRepository;

    @Override
    public List<SeriesBookResponse> getAllDataBook() {
        List<SeriesBook> dataBooks = dataBookRepository.findAll();
        List<SeriesBookResponse> responses = new ArrayList<>();
        dataBooks.forEach(dataBook -> {
            responses.add(new SeriesBookResponse(
                    dataBook.getSeriesName(),
                    dataBook.getFirstPublishedYear(),
                    dataBook.getAuthor(),
                    dataBook.getCoverImageUrl(),
                    dataBook.getIsPopular(),
                    dataBook.getDescription(),
                    dataBook.getRating(),
                    dataBook.getLanguage(),
                    dataBook.getEpisodes()
            ));
        });

        return responses;
    }
}
