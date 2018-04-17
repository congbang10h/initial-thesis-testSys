package com.congbang.service;

import com.congbang.domain.QuestionItem;
import com.congbang.repository.QuestionItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionItemService {
    private QuestionItemRepository questionItemRepository;

    @Autowired
    public QuestionItemService(QuestionItemRepository questionItemRepository) {
        this.questionItemRepository = questionItemRepository;
    }

    public List<QuestionItem> getByQuestionId(Integer id) {
        return questionItemRepository.findByQuestionQuestionId(id);
    }
}
