package com.vuthehuyht.comicsapp.services.impl;

import com.vuthehuyht.comicsapp.enums.ErrorCode;
import com.vuthehuyht.comicsapp.exceptions.BookNotFoundException;
import com.vuthehuyht.comicsapp.models.Book;
import com.vuthehuyht.comicsapp.repositories.BookRepository;
import com.vuthehuyht.comicsapp.responses.BookResponse;
import com.vuthehuyht.comicsapp.services.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {
    final private BookRepository bookRepository;

    @Override
    public BookResponse getBookByEpisodeAndDataBookId(Integer episode, Long dataBookId) {
        Optional<Book> bookOptional = bookRepository.findBookByEpisodesAndDataBookId(episode, dataBookId);
        if(bookOptional.isEmpty()) {
            throw new BookNotFoundException(ErrorCode.BOOK_NOT_FOUND);
        }

        return new BookResponse(
                bookOptional.get().getId(),
                bookOptional.get().getName(),
                bookOptional.get().getAuthor(),
                bookOptional.get().getRating(),
                bookOptional.get().getProgress(),
                bookOptional.get().getImageUrl(),
                bookOptional.get().isPicked(),
                bookOptional.get().getKeyBook(),
                bookOptional.get().getYear(),
                bookOptional.get().getEpisode()
        );
    }

    @Override
    public List<BookResponse> getBooksByDataBookId(Long dataBookId) {
        List<Book> books = bookRepository.findAllBookByDataBookId(dataBookId);

        List<BookResponse> bookResponses = new ArrayList<>();
        books.forEach((book) -> bookResponses.add(new BookResponse(
            book.getId(),
            book.getName(),
                book.getAuthor(),
                book.getRating(),
                book.getProgress(),
                book.getImageUrl(),
                book.isPicked(),
                book.getKeyBook(),
                book.getYear(),
                book.getEpisode()
        )));
        return bookResponses;
    }
}
