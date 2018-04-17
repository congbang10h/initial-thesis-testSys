package com.congbang.repository;

import com.congbang.domain.University;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UniversityRepository extends CrudRepository<University, Integer> {
    List<University> findAllByOrderByUnivCodeAsc();

    List<University> findByUnivNameVnContaining(String q);

}
