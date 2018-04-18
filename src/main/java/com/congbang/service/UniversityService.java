package com.congbang.service;

import com.congbang.domain.University;
import com.congbang.repository.UnivMissionRepository;
import com.congbang.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {
    private UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }


    public List<University> list(){
        return universityRepository.findAllByOrderByUnivCodeAsc();
    }

    public void deleteById(Integer id) {
        universityRepository.delete(id);
    }

    public University getById(Integer id) {
        return universityRepository.findOne(id);
    }

    public University save(University university) {
        return universityRepository.save(university);
    }

    public List<University> search(String g){return universityRepository.findByUnivNameVnContaining(g);}


}
