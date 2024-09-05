package com.vuthehuyht.comicsapp.repositories;

import com.vuthehuyht.comicsapp.models.SeriesBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesBookRepository extends JpaRepository<SeriesBook, Long> {
}
