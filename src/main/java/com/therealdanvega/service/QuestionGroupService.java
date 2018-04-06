package com.therealdanvega.service;

import com.therealdanvega.domain.QuestionGroup;
import com.therealdanvega.repository.QuestionGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionGroupService {
    private QuestionGroupRepository questionGroupRepository;

    public List<QuestionGroup> list(){
        return questionGroupRepository.findAllByOrderByQuestionGroupIdAsc();
    }

    @Autowired
    public QuestionGroupService(QuestionGroupRepository questionGroupRepository) {
        this.questionGroupRepository = questionGroupRepository;
    }
}
