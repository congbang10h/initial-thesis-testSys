package com.therealdanvega.repository;

import com.therealdanvega.domain.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<Test, Integer> {
    List<Test> findAllByOrderByTestCodeAsc();

    List<Test> findByTestCodeContaining(String q);

}
