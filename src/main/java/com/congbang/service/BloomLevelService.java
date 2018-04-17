package com.congbang.service;

import com.congbang.domain.BloomLevel;
import com.congbang.repository.BloomLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloomLevelService {
    private BloomLevelRepository bloomLevelRepository;

    @Autowired
    public BloomLevelService(BloomLevelRepository bloomLevelRepository) {
        this.bloomLevelRepository = bloomLevelRepository;
    }

    public List<BloomLevel> list() {
        return bloomLevelRepository.findAllByOrderByBloomLevelCodeAsc();
    }
}
