package com.vuthehuyht.comicsapp.repositories;

import com.vuthehuyht.comicsapp.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "select * from book b where b.episode = :episode and b.series_book_id = :dataBookId", nativeQuery = true)
    Optional<Book> findBookByEpisodesAndDataBookId(Integer episode, Long dataBookId);

    @Query(value = "select * from book b where b.series_book_id = :dataBookId", nativeQuery = true)
    List<Book> findAllBookByDataBookId(Long dataBookId);
}
