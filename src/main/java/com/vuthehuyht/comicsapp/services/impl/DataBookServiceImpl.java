package com.vuthehuyht.comicsapp.services.impl;

import com.vuthehuyht.comicsapp.models.DataBook;
import com.vuthehuyht.comicsapp.repositories.DataBookRepository;
import com.vuthehuyht.comicsapp.responses.DataBookResponse;
import com.vuthehuyht.comicsapp.services.DataBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataBookServiceImpl implements DataBookService {
    private final DataBookRepository dataBookRepository;

    @Override
    public List<DataBookResponse> getAllDataBook() {
        List<DataBook> dataBooks = dataBookRepository.findAll();
        List<DataBookResponse> responses = new ArrayList<>();
        dataBooks.forEach(dataBook -> {
            responses.add(new DataBookResponse(
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
