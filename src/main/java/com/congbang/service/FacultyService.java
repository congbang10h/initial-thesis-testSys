package com.congbang.service;

import com.congbang.domain.Faculty;
import com.congbang.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    private FacultyRepository facultyRepository;

    @Autowired

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public List<Faculty> list(){
        return facultyRepository.findAllByOrderByUniversityUnivIdAsc();
    }

    public void deleteById(Integer id) {
        facultyRepository.delete(id);
    }

    public Faculty getById(Integer id) {
        return facultyRepository.findOne(id);
    }

    public Faculty save(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public List<Faculty> search(String g){return facultyRepository.findByFacultyNameVnContaining(g);}

}
