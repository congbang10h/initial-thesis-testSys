package com.congbang.service;

import com.congbang.domain.UnivMissionItem;
import com.congbang.repository.UnivMissionItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnivMissionItemService {
    private UnivMissionItemRepository univMissionItemRepository;

    @Autowired
    public UnivMissionItemService(UnivMissionItemRepository univMissionItemRepository) {
        this.univMissionItemRepository = univMissionItemRepository;
    }

    public List<UnivMissionItem> listByUmId(Integer umId){
        return univMissionItemRepository.findAllByUnivMissionUmId(umId);
    }

    public void deleteById(Integer id) {
        univMissionItemRepository.delete(id);
    }

    public UnivMissionItem getById(Integer id) {
        return univMissionItemRepository.findOne(id);
    }

    public UnivMissionItem save(UnivMissionItem course) {
        return univMissionItemRepository.save(course);
    }

    public List<UnivMissionItem> search(String g){return univMissionItemRepository.findByUmiCodeContaining(g);}
}
