package com.congbang.repository;

import com.congbang.domain.QuestionItem;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface QuestionItemRepository extends CrudRepository<QuestionItem, Integer> {
    List<QuestionItem> findByQuestionQuestionId(Integer questionId);
}
