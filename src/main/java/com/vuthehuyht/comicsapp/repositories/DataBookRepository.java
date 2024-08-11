package com.vuthehuyht.comicsapp.repositories;

import com.vuthehuyht.comicsapp.models.DataBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBookRepository extends JpaRepository<DataBook, Long> {
}
