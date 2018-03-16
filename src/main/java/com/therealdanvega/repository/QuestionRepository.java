package com.therealdanvega.repository;

import com.therealdanvega.domain.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer>{

    List<Question> findAllByOrderByQuestionIdAsc();

}
