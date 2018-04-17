package com.congbang.service;

import com.congbang.domain.Test;
import com.congbang.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private TestRepository testRepository;

    @Autowired

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Test> list(){
        return testRepository.findAllByOrderByTestCodeAsc();
    }

    public void deleteById(Integer id) {
        testRepository.delete(id);
    }

    public Test getById(Integer id) {
        return testRepository.findOne(id);
    }

    public Test save(Test test) {
        return testRepository.save(test);
    }

    public List<Test> search(String g){return testRepository.findByTestCodeContaining(g);}

}
