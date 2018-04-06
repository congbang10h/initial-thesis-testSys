package com.therealdanvega.service;

import com.therealdanvega.domain.Question;
import com.therealdanvega.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    public List<Question> list(){
        return questionRepository.findAllByOrderByQuestionIdDesc();
    }

//    public List<Question> listByQgroupId(Integer i){
//        return questionRepository.findByQuestionTypeDictContaining(i);
//    }

    public void deleteById(Integer id) {
        questionRepository.delete(id);
    }

    public Question getById(Integer id) {
        return questionRepository.findOne(id);
    }

    public Question save(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> search(String g){return questionRepository.findByQuestionDescContaining(g);}
}
