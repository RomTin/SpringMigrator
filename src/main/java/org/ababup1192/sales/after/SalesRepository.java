package org.ababup1192.sales.after;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SalesRepository extends PagingAndSortingRepository<Sales, Integer> {
    // Delete code on production
    @Query(value = "TRUNCATE TABLE sales;", nativeQuery = true)
    @Modifying
    @Transactional
    void truncate();

    // Delete code on production
    @Query(value = "DROP TABLE sales;", nativeQuery = true)
    @Modifying
    @Transactional
    void drop();

    List<Sales> findAll();
}

