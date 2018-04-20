package com.congbang.repository;

import com.congbang.domain.Faculty;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacultyRepository extends CrudRepository<Faculty,Integer> {
    List<Faculty> findAllByOrderByUniversityUnivIdAsc();

    List<Faculty> findByFacultyNameVnContaining(String g);
}