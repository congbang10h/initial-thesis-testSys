package com.congbang.service;

import com.congbang.domain.QuestionTypeDict;
import com.congbang.repository.QuestionTypeDictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeDictService {
    private QuestionTypeDictRepository questionTypeDictRepository;

    @Autowired
    public QuestionTypeDictService(QuestionTypeDictRepository questionTypeDictRepository) {
        this.questionTypeDictRepository = questionTypeDictRepository;
    }

    public List<QuestionTypeDict> list(){return questionTypeDictRepository.findAllByOrderByQuestionTypeIdDesc();}
}

