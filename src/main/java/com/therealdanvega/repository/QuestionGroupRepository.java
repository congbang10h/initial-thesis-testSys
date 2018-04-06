package com.therealdanvega.repository;

import com.therealdanvega.domain.QuestionGroup;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionGroupRepository extends CrudRepository<QuestionGroup,Integer> {
    List<QuestionGroup> findAllByOrderByQuestionGroupIdAsc();
}
