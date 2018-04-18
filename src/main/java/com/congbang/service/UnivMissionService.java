package com.congbang.service;

import com.congbang.domain.UnivMission;
import com.congbang.repository.UnivMissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnivMissionService {
    private UnivMissionRepository univMissionRepository;

    @Autowired
    public UnivMissionService(UnivMissionRepository univMissionRepository) {
        this.univMissionRepository = univMissionRepository;
    }

    public List<UnivMission> findAllByUnivId(Integer id){
        return univMissionRepository.findByUniversityUnivId(id);
    }

    public void deleteById(Integer id) {
        univMissionRepository.delete(id);
    }

    public UnivMission getById(Integer id) {
        return univMissionRepository.findOne(id);
    }

    public UnivMission save(UnivMission univMission) {
        return univMissionRepository.save(univMission);
    }

}
