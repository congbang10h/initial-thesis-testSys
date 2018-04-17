package com.congbang.repository;

import com.congbang.domain.QuestionGroup;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionGroupRepository extends CrudRepository<QuestionGroup,Integer> {
    List<QuestionGroup> findAllByOrderByQuestionGroupIdAsc();
}
