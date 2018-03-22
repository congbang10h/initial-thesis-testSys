package com.therealdanvega.repository;

import com.therealdanvega.domain.QuestionTypeDict;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionTypeDictRepository extends CrudRepository<QuestionTypeDict,Integer> {

    List<QuestionTypeDict> findAllByOrderByQuestionTypeIdDesc();
}
