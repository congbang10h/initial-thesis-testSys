package com.therealdanvega.repository;

import com.therealdanvega.domain.University;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UniversityRepository extends CrudRepository<University, Integer> {
    List<University> findAllByOrderByUnivCodeAsc();

    List<University> findByUnivNameVnContaining(String q);

}
