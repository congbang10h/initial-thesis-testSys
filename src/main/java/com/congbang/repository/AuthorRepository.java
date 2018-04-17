package com.congbang.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.congbang.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}
